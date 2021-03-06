/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */
package org.apache.poi.sl.usermodel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.crypto.Biff8EncryptionKey;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.util.IOUtils;

public class SlideShowFactory {
    /** The first 4 bytes of an OOXML file, used in detection */
    private static final byte[] OOXML_FILE_HEADER = { 0x50, 0x4b, 0x03, 0x04 };
    
    /**
     * Creates a SlideShow from the given NPOIFSFileSystem.
     *
     * @param fs The {@link NPOIFSFileSystem} to read the document from
     *
     * @return The created SlideShow
     *
     * @throws IOException if an error occurs while reading the data
     */
    public static SlideShow<?,?> create(NPOIFSFileSystem fs) throws IOException {
        return create(fs, null);
    }

    /**
     * Creates a SlideShow from the given NPOIFSFileSystem, which may
     * be password protected
     *
     * @param fs The {@link NPOIFSFileSystem} to read the document from
     * @param password The password that should be used or null if no password is necessary.
     *
     * @return The created SlideShow
     *
     * @throws IOException if an error occurs while reading the data
     */
    public static SlideShow<?,?> create(NPOIFSFileSystem fs, String password) throws IOException {
        DirectoryNode root = fs.getRoot();

        // Encrypted OOXML files go inside OLE2 containers, is this one?
        if (root.hasEntry(Decryptor.DEFAULT_POIFS_ENTRY)) {
            EncryptionInfo info = new EncryptionInfo(fs);
            Decryptor d = Decryptor.getInstance(info);

            boolean passwordCorrect = false;
            InputStream stream = null;
            try {
                if (password != null && d.verifyPassword(password)) {
                    passwordCorrect = true;
                }
                if (!passwordCorrect && d.verifyPassword(Decryptor.DEFAULT_PASSWORD)) {
                    passwordCorrect = true;
                }
                if (passwordCorrect) {
                    stream = d.getDataStream(root);
                }

                if (!passwordCorrect) {
                    String err = (password != null)
                        ? "Password incorrect"
                        : "The supplied spreadsheet is protected, but no password was supplied";
                    throw new EncryptedDocumentException(err);
                }

                return createXSLFSlideShow(stream);
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            } finally {
                if (stream != null) stream.close();
            }
        }

        // If we get here, it isn't an encrypted PPTX file
        // So, treat it as a regular HSLF PPT one
        if (password != null) {
            Biff8EncryptionKey.setCurrentUserPassword(password);
        }
        try {
            return createHSLFSlideShow(fs);
        } finally {
            Biff8EncryptionKey.setCurrentUserPassword(null);
        }
    }

    /**
     * Creates the appropriate HSLFSlideShow / XMLSlideShow from
     *  the given InputStream.
     *
     * <p>Your input stream MUST either support mark/reset, or
     *  be wrapped as a {@link PushbackInputStream}! Note that
     *  using an {@link InputStream} has a higher memory footprint
     *  than using a {@link File}.</p>
     *
     * <p>Note that in order to properly release resources the
     *  SlideShow should be closed after use. Note also that loading
     *  from an InputStream requires more memory than loading
     *  from a File, so prefer {@link #create(File)} where possible.
     *
     *  @param inp The {@link InputStream} to read data from.
     *
     *  @return The created SlideShow
     *
     *  @throws IOException if an error occurs while reading the data
     *  @throws EncryptedDocumentException If the SlideShow given is password protected
     */
    public static SlideShow<?,?> create(InputStream inp) throws IOException, EncryptedDocumentException {
        return create(inp, null);
    }

    /**
     * Creates the appropriate HSLFSlideShow / XMLSlideShow from
     *  the given InputStream, which may be password protected.
     * <p>Your input stream MUST either support mark/reset, or
     *  be wrapped as a {@link PushbackInputStream}! Note that
     *  using an {@link InputStream} has a higher memory footprint
     *  than using a {@link File}.</p>
     *
     * <p>Note that in order to properly release resources the
     *  SlideShow should be closed after use. Note also that loading
     *  from an InputStream requires more memory than loading
     *  from a File, so prefer {@link #create(File)} where possible.</p>
     *
     *  @param inp The {@link InputStream} to read data from.
     *  @param password The password that should be used or null if no password is necessary.
     *
     *  @return The created SlideShow
     *
     *  @throws IOException if an error occurs while reading the data
     *  @throws EncryptedDocumentException If the wrong password is given for a protected file
     */
    @SuppressWarnings("resource")
    public static SlideShow<?,?> create(InputStream inp, String password) throws IOException, EncryptedDocumentException {
        // If clearly doesn't do mark/reset, wrap up
        if (! inp.markSupported()) {
            inp = new PushbackInputStream(inp, 8);
        }

        // Ensure that there is at least some data there
        byte[] header8 = IOUtils.peekFirst8Bytes(inp);

        // Try to create
        if (NPOIFSFileSystem.hasPOIFSHeader(header8)) {
            NPOIFSFileSystem fs = new NPOIFSFileSystem(inp);
            return create(fs, password);
        }
        if (hasOOXMLHeader(inp)) {
            return createXSLFSlideShow(inp);
        }
        throw new IllegalArgumentException("Your InputStream was neither an OLE2 stream, nor an OOXML stream");
    }

    /**
     * Creates the appropriate HSLFSlideShow / XMLSlideShow from
     *  the given File, which must exist and be readable.
     * <p>Note that in order to properly release resources the
     *  SlideShow should be closed after use.
     *
     *  @param file The file to read data from.
     *
     *  @return The created SlideShow
     *
     *  @throws IOException if an error occurs while reading the data
     *  @throws EncryptedDocumentException If the SlideShow given is password protected
     */
    public static SlideShow<?,?> create(File file) throws IOException, EncryptedDocumentException {
        return create(file, null);
    }

    /**
     * Creates the appropriate HSLFSlideShow / XMLSlideShow from
     *  the given File, which must exist and be readable, and
     *  may be password protected
     * <p>Note that in order to properly release resources the
     *  SlideShow should be closed after use.
     *
     *  @param file The file to read data from.
     *  @param password The password that should be used or null if no password is necessary.
     *
     *  @return The created SlideShow
     *
     *  @throws IOException if an error occurs while reading the data
     *  @throws EncryptedDocumentException If the wrong password is given for a protected file
     */
    public static SlideShow<?,?> create(File file, String password) throws IOException, EncryptedDocumentException {
        return create(file, password, false);
    }

    /**
     * Creates the appropriate HSLFSlideShow / XMLSlideShow from
     *  the given File, which must exist and be readable, and
     *  may be password protected
     * <p>Note that in order to properly release resources the
     *  SlideShow should be closed after use.
     *
     *  @param file The file to read data from.
     *  @param password The password that should be used or null if no password is necessary.
     *  @param readOnly If the SlideShow should be opened in read-only mode to avoid writing back
     *      changes when the document is closed.
     *
     *  @return The created SlideShow
     *
     *  @throws IOException if an error occurs while reading the data
     *  @throws EncryptedDocumentException If the wrong password is given for a protected file
     */
    @SuppressWarnings("resource")
    public static SlideShow<?,?> create(File file, String password, boolean readOnly) throws IOException, EncryptedDocumentException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.toString());
        }

        try {
            NPOIFSFileSystem fs = new NPOIFSFileSystem(file, readOnly);
            return create(fs, password);
        } catch(OfficeXmlFileException e) {
            return createXSLFSlideShow(file, readOnly);
        }
    }
    
    protected static SlideShow<?,?> createHSLFSlideShow(Object... args) throws IOException, EncryptedDocumentException {
        return createSlideShow("org.apache.poi.hslf.usermodel.HSLFSlideShowFactory", args);
    }
    
    protected static SlideShow<?,?> createXSLFSlideShow(Object... args) throws IOException, EncryptedDocumentException {
        return createSlideShow("org.apache.poi.xslf.usermodel.XSLFSlideShowFactory", args);
    }
    
    protected static SlideShow<?,?> createSlideShow(String factoryClass, Object args[]) throws IOException, EncryptedDocumentException {
        try {
            Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(factoryClass);
            Class<?> argsClz[] = new Class<?>[args.length];
            int i=0;
            for (Object o : args) {
                Class<?> c = o.getClass();
                if (Boolean.class.isAssignableFrom(c)) {
                    c = boolean.class;
                } else if (InputStream.class.isAssignableFrom(c)) {
                    c = InputStream.class;
                }
                argsClz[i++] = c;
            }
            Method m = clazz.getMethod("createSlideShow", argsClz);
            return (SlideShow<?,?>)m.invoke(null, args);
        } catch (InvocationTargetException e) {
            Throwable t = e.getCause();
            if (t instanceof IOException) {
                throw (IOException)t;
            } else if (t instanceof EncryptedDocumentException) {
                throw (EncryptedDocumentException)t;
            } else {
                throw new IOException(t);
            }
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /**
     * This copied over from ooxml, because we can't rely on these classes in the main package
     * 
     * @see org.apache.poi.POIXMLDocument#hasOOXMLHeader(InputStream)
     */
    protected static boolean hasOOXMLHeader(InputStream inp) throws IOException {
        // We want to peek at the first 4 bytes
        inp.mark(4);

        byte[] header = new byte[4];
        int bytesRead = IOUtils.readFully(inp, header);

        // Wind back those 4 bytes
        if(inp instanceof PushbackInputStream) {
            PushbackInputStream pin = (PushbackInputStream)inp;
            pin.unread(header, 0, bytesRead);
        } else {
            inp.reset();
        }

        // Did it match the ooxml zip signature?
        return (
            bytesRead == 4 &&
            header[0] == OOXML_FILE_HEADER[0] &&
            header[1] == OOXML_FILE_HEADER[1] &&
            header[2] == OOXML_FILE_HEADER[2] &&
            header[3] == OOXML_FILE_HEADER[3]
        );
    }

}
