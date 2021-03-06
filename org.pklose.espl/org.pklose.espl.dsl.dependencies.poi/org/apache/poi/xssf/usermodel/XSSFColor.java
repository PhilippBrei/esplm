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
package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.apache.poi.util.Internal;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;

/**
 * Represents a color in SpreadsheetML
 */
public class XSSFColor extends ExtendedColor {
    private CTColor ctColor;

    /**
     * Create an instance of XSSFColor from the supplied XML bean
     */
    public XSSFColor(CTColor color) {
        this.ctColor = color;
    }

    /**
     * Create an new instance of XSSFColor
     */
    public XSSFColor() {
        this.ctColor = CTColor.Factory.newInstance();
    }

    public XSSFColor(java.awt.Color clr) {
        this();
        setColor(clr);
    }

    public XSSFColor(byte[] rgb) {
        this();
        ctColor.setRgb(rgb);
    }

    /**
     * A boolean value indicating the ctColor is automatic and system ctColor dependent.
     */
    @Override
    public boolean isAuto() {
        return ctColor.getAuto();
    }
    /**
     * A boolean value indicating the ctColor is automatic and system ctColor dependent.
     */
    public void setAuto(boolean auto) {
        ctColor.setAuto(auto);
    }

    /**
     * A boolean value indicating the ctColor is Indexed
     */
    @Override
    public boolean isIndexed() {
        return ctColor.isSetIndexed();
    }

    /**
     * A boolean value indicating the ctColor is RGB or ARGB based
     */
    @Override
    public boolean isRGB() {
        return ctColor.isSetRgb();
    }

    /**
     * A boolean value indicating the ctColor is Theme based
     */
    @Override
    public boolean isThemed() {
        return ctColor.isSetTheme();
    }
    
    /**
     * A boolean value indicating if the ctColor has a tint or not
     */
    public boolean hasTint() {
        if (! ctColor.isSetRgb()) return false;
        return ctColor.getRgb().length == 4;
    }

    /**
     * Indexed ctColor value. Only used for backwards compatibility. References a ctColor in indexedColors.
     */
    public short getIndex() {
        return (short)ctColor.getIndexed();
    }
    /**
     * Indexed ctColor value. Only used for backwards compatibility. References a ctColor in indexedColors.
     */
    public short getIndexed() {
        return getIndex();
    }

    /**
     * Indexed ctColor value. Only used for backwards compatibility. References a ctColor in indexedColors.
     */
    public void setIndexed(int indexed) {
        ctColor.setIndexed(indexed);
    }

   /**
    * Standard Red Green Blue ctColor value (RGB).
    * If there was an A (Alpha) value, it will be stripped.
    */
   public byte[] getRGB() {
      byte[] rgb = getRGBOrARGB();
      if(rgb == null) return null;

      if(rgb.length == 4) {
         // Need to trim off the alpha
         byte[] tmp = new byte[3];
         System.arraycopy(rgb, 1, tmp, 0, 3);
         return tmp;
      } else {
         return rgb;
      }
   }
   /**
    * @deprecated use {@link #getRGB()}
    */
   public byte[] getRgb() {
       return getRGB();
   }

   /**
    * Standard Alpha Red Green Blue ctColor value (ARGB).
    */
   public byte[] getARGB() {
      byte[] rgb = getRGBOrARGB();
      if(rgb == null) return null;

      if(rgb.length == 3) {
         // Pad with the default Alpha
         byte[] tmp = new byte[4];
         tmp[0] = -1;
         System.arraycopy(rgb, 0, tmp, 1, 3);
         return tmp;
      } else {
         return rgb;
      }
   }
   /**
    * @deprecated Use {@link #getARGB()}
    */
   public byte[] getARgb() {
       return getARGB();
   }

   protected byte[] getStoredRBG() {
       return ctColor.getRgb();
   }

    /**
     * Standard Red Green Blue ctColor value (RGB) with applied tint.
     * Alpha values are ignored.
     */
    public byte[] getRgbWithTint() {
        return getRGBWithTint();
    }

    /**
     * Standard Alpha Red Green Blue ctColor value (ARGB).
     */
    public void setRgb(byte[] rgb) {
       setRGB(rgb);
    }
    /**
     * Standard Alpha Red Green Blue ctColor value (ARGB).
     */
    public void setRGB(byte[] rgb) {
       ctColor.setRgb(rgb);
    }

    /**
     * Index into the <clrScheme> collection, referencing a particular <sysClr> or
     *  <srgbClr> value expressed in the Theme part.
     */
   public int getTheme() {
      return (int)ctColor.getTheme();
    }

    /**
     * Index into the <clrScheme> collection, referencing a particular <sysClr> or
     *  <srgbClr> value expressed in the Theme part.
     */
    public void setTheme(int theme) {
        ctColor.setTheme(theme);
    }

    /**
     * Specifies the tint value applied to the ctColor.
     *
     * <p>
     * If tint is supplied, then it is applied to the RGB value of the ctColor to determine the final
     * ctColor applied.
     * </p>
     * <p>
     * The tint value is stored as a double from -1.0 .. 1.0, where -1.0 means 100% darken and
     * 1.0 means 100% lighten. Also, 0.0 means no change.
     * </p>
     * <p>
     * In loading the RGB value, it is converted to HLS where HLS values are (0..HLSMAX), where
     * HLSMAX is currently 255.
     * </p>
     * Here are some examples of how to apply tint to ctColor:
     * <blockquote>
     * <pre>
     * If (tint &lt; 0)
     * Lum' = Lum * (1.0 + tint)
     *
     * For example: Lum = 200; tint = -0.5; Darken 50%
     * Lum' = 200 * (0.5) =&gt; 100
     * For example: Lum = 200; tint = -1.0; Darken 100% (make black)
     * Lum' = 200 * (1.0-1.0) =&gt; 0
     * If (tint &gt; 0)
     * Lum' = Lum * (1.0-tint) + (HLSMAX - HLSMAX * (1.0-tint))
     * For example: Lum = 100; tint = 0.75; Lighten 75%
     *
     * Lum' = 100 * (1-.75) + (HLSMAX - HLSMAX*(1-.75))
     * = 100 * .25 + (255 - 255 * .25)
     * = 25 + (255 - 63) = 25 + 192 = 217
     * For example: Lum = 100; tint = 1.0; Lighten 100% (make white)
     * Lum' = 100 * (1-1) + (HLSMAX - HLSMAX*(1-1))
     * = 100 * 0 + (255 - 255 * 0)
     * = 0 + (255 - 0) = 255
     * </pre>
     * </blockquote>
     *
     * @return the tint value
     */
    public double getTint() {
        return ctColor.getTint();
    }

    /**
     * Specifies the tint value applied to the ctColor.
     *
     * <p>
     * If tint is supplied, then it is applied to the RGB value of the ctColor to determine the final
     * ctColor applied.
     * </p>
     * <p>
     * The tint value is stored as a double from -1.0 .. 1.0, where -1.0 means 100% darken and
     * 1.0 means 100% lighten. Also, 0.0 means no change.
     * </p>
     * <p>
     * In loading the RGB value, it is converted to HLS where HLS values are (0..HLSMAX), where
     * HLSMAX is currently 255.
     * </p>
     * Here are some examples of how to apply tint to ctColor:
     * <blockquote>
     * <pre>
     * If (tint &lt; 0)
     * Lum' = Lum * (1.0 + tint)
     *
     * For example: Lum = 200; tint = -0.5; Darken 50%
     * Lum' = 200 * (0.5) =&gt; 100
     * For example: Lum = 200; tint = -1.0; Darken 100% (make black)
     * Lum' = 200 * (1.0-1.0) =&gt; 0
     * If (tint &gt; 0)
     * Lum' = Lum * (1.0-tint) + (HLSMAX - HLSMAX * (1.0-tint))
     * For example: Lum = 100; tint = 0.75; Lighten 75%
     *
     * Lum' = 100 * (1-.75) + (HLSMAX - HLSMAX*(1-.75))
     * = 100 * .25 + (255 - 255 * .25)
     * = 25 + (255 - 63) = 25 + 192 = 217
     * For example: Lum = 100; tint = 1.0; Lighten 100% (make white)
     * Lum' = 100 * (1-1) + (HLSMAX - HLSMAX*(1-1))
     * = 100 * 0 + (255 - 255 * 0)
     * = 0 + (255 - 0) = 255
     * </pre>
     * </blockquote>
     *
     * @param tint the tint value
     */
    public void setTint(double tint) {
        ctColor.setTint(tint);
    }

    /**
     * Returns the underlying XML bean
     *
     * @return the underlying XML bean
     */
    @Internal
    public CTColor getCTColor(){
        return ctColor;
    }

    public static XSSFColor toXSSFColor(Color color) {
        if (color != null && !(color instanceof XSSFColor)) {
            throw new IllegalArgumentException("Only XSSFColor objects are supported");
        }
        return (XSSFColor)color;
    }
    
    public int hashCode(){
        return ctColor.toString().hashCode();
    }

    public boolean equals(Object o){
        if(o == null || !(o instanceof XSSFColor)) return false;

        XSSFColor cf = (XSSFColor)o;
        return ctColor.toString().equals(cf.getCTColor().toString());
    }
}
