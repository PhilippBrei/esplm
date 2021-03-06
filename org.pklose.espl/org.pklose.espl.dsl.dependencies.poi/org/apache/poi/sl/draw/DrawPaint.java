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

package org.apache.poi.sl.draw;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.sl.usermodel.ColorStyle;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.PaintStyle.GradientPaint;
import org.apache.poi.sl.usermodel.PaintStyle.SolidPaint;
import org.apache.poi.sl.usermodel.PaintStyle.TexturePaint;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;


/**
 * This class handles color transformations.
 * 
 * @see <a href="https://tips4java.wordpress.com/2009/07/05/hsl-color/">HSL code taken from Java Tips Weblog</a>
 */
public class DrawPaint {
    // HSL code is public domain - see https://tips4java.wordpress.com/contact-us/
    
    private final static POILogger LOG = POILogFactory.getLogger(DrawPaint.class);

    protected PlaceableShape<?,?> shape;
    
    public DrawPaint(PlaceableShape<?,?> shape) {
        this.shape = shape;
    }

    private static class SimpleSolidPaint implements SolidPaint {
        private final ColorStyle solidColor;

        SimpleSolidPaint(final Color color) {
            if (color == null) {
                throw new NullPointerException("Color needs to be specified");
            }
            this.solidColor = new ColorStyle(){
                    public Color getColor() { return color; }
                    public int getAlpha() { return -1; }
                    public int getHueOff() { return -1; }
                    public int getHueMod() { return -1; }
                    public int getSatOff() { return -1; }
                    public int getSatMod() { return -1; }
                    public int getLumOff() { return -1; }
                    public int getLumMod() { return -1; }
                    public int getShade() { return -1; }
                    public int getTint() { return -1; }
                };
        }

        SimpleSolidPaint(ColorStyle color) {
            if (color == null) {
                throw new NullPointerException("Color needs to be specified");
            }
            this.solidColor = color;
        }
        
        public ColorStyle getSolidColor() {
            return solidColor;
        }
    }
    
    public static SolidPaint createSolidPaint(final Color color) {
        return (color == null) ? null : new SimpleSolidPaint(color);
    }
    
    public static SolidPaint createSolidPaint(final ColorStyle color) {
        return (color == null) ? null : new SimpleSolidPaint(color);
    }
    
    public Paint getPaint(Graphics2D graphics, PaintStyle paint) {
        if (paint instanceof SolidPaint) {
            return getSolidPaint((SolidPaint)paint, graphics);
        } else if (paint instanceof GradientPaint) {
            return getGradientPaint((GradientPaint)paint, graphics);
        } else if (paint instanceof TexturePaint) {
            return getTexturePaint((TexturePaint)paint, graphics);
        }
        return null;
    }
    
    protected Paint getSolidPaint(SolidPaint fill, Graphics2D graphics) {
        return applyColorTransform(fill.getSolidColor());
    }

    protected Paint getGradientPaint(GradientPaint fill, Graphics2D graphics) {
        switch (fill.getGradientType()) {
        case linear:
            return createLinearGradientPaint(fill, graphics);
        case circular:
            return createRadialGradientPaint(fill, graphics);
        case shape:
            return createPathGradientPaint(fill, graphics);
        default:
            throw new UnsupportedOperationException("gradient fill of type "+fill+" not supported.");
        }
    }

    protected Paint getTexturePaint(TexturePaint fill, Graphics2D graphics) {
        InputStream is = fill.getImageData();
        if (is == null) return null;
        assert(graphics != null);
        
        ImageRenderer renderer = (ImageRenderer)graphics.getRenderingHint(Drawable.IMAGE_RENDERER);
        if (renderer == null) renderer = new ImageRenderer();

        try {
            renderer.loadImage(is, fill.getContentType());
            is.close();
        } catch (IOException e) {
            LOG.log(POILogger.ERROR, "Can't load image data - using transparent color", e);
            return null;
        }

        int alpha = fill.getAlpha();
        if (0 <= alpha && alpha < 100000) {
            renderer.setAlpha(alpha/100000.f);
        }
        
        Rectangle2D textAnchor = shape.getAnchor();
        Paint paint = new java.awt.TexturePaint(renderer.getImage(), textAnchor);

        return paint;
    }
    
    /**
     * Convert color transformations in {@link ColorStyle} to a {@link Color} instance
     * 
     * @see <a href="https://msdn.microsoft.com/en-us/library/dd560821%28v=office.12%29.aspx">Using Office Open XML to Customize Document Formatting in the 2007 Office System</a>
     * @see <a href="https://social.msdn.microsoft.com/Forums/office/en-US/040e0a1f-dbfe-4ce5-826b-38b4b6f6d3f7/saturation-modulation-satmod">saturation modulation (satMod)</a>
     * @see <a href="http://stackoverflow.com/questions/6754127/office-open-xml-satmod-results-in-more-than-100-saturation">Office Open XML satMod results in more than 100% saturation</a>
     */
    public static Color applyColorTransform(ColorStyle color){
        // TODO: The colors don't match 100% the results of Powerpoint, maybe because we still
        // operate in sRGB and not scRGB ... work in progress ...

        Color result = color.getColor();
        if (result == null) return null;

        double alpha = getAlpha(result, color);
        double hsl[] = RGB2HSL(result); // values are in the range [0..100] (usually ...)
        applyHslModOff(hsl, 0, color.getHueMod(), color.getHueOff());
        applyHslModOff(hsl, 1, color.getSatMod(), color.getSatOff());
        applyHslModOff(hsl, 2, color.getLumMod(), color.getLumOff());
        applyShade(hsl, color);
        applyTint(hsl, color);

        result = HSL2RGB(hsl[0], hsl[1], hsl[2], alpha);
        
        return result;
    }

    private static double getAlpha(Color c, ColorStyle fc) {
        double alpha = c.getAlpha()/255d;
        int fcAlpha = fc.getAlpha();
        if (fcAlpha != -1) {
            alpha *= fcAlpha/100000d;
        }
        return Math.min(1, Math.max(0, alpha));
    }
    
    /**
     * Apply the modulation and offset adjustments to the given HSL part
     * 
     * Example for lumMod/lumOff:
     * The lumMod value is the percent luminance. A lumMod value of "60000",
     * is 60% of the luminance of the original color.
     * When the color is a shade of the original theme color, the lumMod
     * attribute is the only one of the tags shown here that appears.
     * The <a:lumOff> tag appears after the <a:lumMod> tag when the color is a
     * tint of the original. The lumOff value always equals 1-lumMod, which is used in the tint calculation
     * 
     * Despite having different ways to display the tint and shade percentages,
     * all of the programs use the same method to calculate the resulting color.
     * Convert the original RGB value to HSL ... and then adjust the luminance (L)
     * with one of the following equations before converting the HSL value back to RGB.
     * (The % tint in the following equations refers to the tint, themetint, themeshade,
     * or lumMod values, as applicable.)
     * 
     * @param hsl the hsl values
     * @param hslPart the hsl part to modify [0..2]
     * @param mod the modulation adjustment
     * @param off the offset adjustment
     * @return the modified hsl value
     * 
     */
    private static void applyHslModOff(double hsl[], int hslPart, int mod, int off) {
        if (mod == -1) mod = 100000;
        if (off == -1) off = 0;
        if (!(mod == 100000 && off == 0)) {
            double fOff = off / 1000d;
            double fMod = mod / 100000d;
            hsl[hslPart] = hsl[hslPart]*fMod+fOff;
        }
    }
    
    /**
     * Apply the shade
     * 
     * For a shade, the equation is luminance * %tint.
     */
    private static void applyShade(double hsl[], ColorStyle fc) {
        int shade = fc.getShade();
        if (shade == -1) return;
        
        double fshade = shade / 100000.d;
        
        hsl[2] *= fshade;
    }

    /**
     * Apply the tint
     * 
     * For a tint, the equation is luminance * %tint + (1-%tint).
     * (Note that 1-%tint is equal to the lumOff value in DrawingML.)
     */
    private static void applyTint(double hsl[], ColorStyle fc) {
        int tint = fc.getTint();
        if (tint == -1) return;
        
        double ftint = tint / 100000.f;

        hsl[2] = hsl[2] * ftint + (100 - ftint*100.);
    }
    

    protected Paint createLinearGradientPaint(GradientPaint fill, Graphics2D graphics) {
        double angle = fill.getGradientAngle();
        Rectangle2D anchor = DrawShape.getAnchor(graphics, shape);

        AffineTransform at = AffineTransform.getRotateInstance(
            Math.toRadians(angle),
            anchor.getX() + anchor.getWidth() / 2,
            anchor.getY() + anchor.getHeight() / 2);

        double diagonal = Math.sqrt(anchor.getHeight() * anchor.getHeight() + anchor.getWidth() * anchor.getWidth());
        Point2D p1 = new Point2D.Double(anchor.getX() + anchor.getWidth() / 2 - diagonal / 2,
                anchor.getY() + anchor.getHeight() / 2);
        p1 = at.transform(p1, null);

        Point2D p2 = new Point2D.Double(anchor.getX() + anchor.getWidth(), anchor.getY() + anchor.getHeight() / 2);
        p2 = at.transform(p2, null);

        snapToAnchor(p1, anchor);
        snapToAnchor(p2, anchor);

        float[] fractions = fill.getGradientFractions();
        Color[] colors = new Color[fractions.length];
        
        int i = 0;
        for (ColorStyle fc : fill.getGradientColors()) {
            colors[i++] = applyColorTransform(fc);
        }

        AffineTransform grAt  = new AffineTransform();
        if(fill.isRotatedWithShape()) {
            double rotation = shape.getRotation();
            if (rotation != 0.) {
                double centerX = anchor.getX() + anchor.getWidth() / 2;
                double centerY = anchor.getY() + anchor.getHeight() / 2;

                grAt.translate(centerX, centerY);
                grAt.rotate(Math.toRadians(-rotation));
                grAt.translate(-centerX, -centerY);
            }
        }

        return new LinearGradientPaint
            (p1, p2, fractions, colors, CycleMethod.NO_CYCLE, ColorSpaceType.SRGB, grAt);
    }

    protected Paint createRadialGradientPaint(GradientPaint fill, Graphics2D graphics) {
        Rectangle2D anchor = DrawShape.getAnchor(graphics, shape);

        Point2D pCenter = new Point2D.Double(anchor.getX() + anchor.getWidth()/2,
                anchor.getY() + anchor.getHeight()/2);

        float radius = (float)Math.max(anchor.getWidth(), anchor.getHeight());

        float[] fractions = fill.getGradientFractions();
        Color[] colors = new Color[fractions.length];

        int i=0;
        for (ColorStyle fc : fill.getGradientColors()) {
            colors[i++] = applyColorTransform(fc);
        }

        return new RadialGradientPaint(pCenter, radius, fractions, colors);
    }

    protected Paint createPathGradientPaint(GradientPaint fill, Graphics2D graphics) {
        // currently we ignore an eventually center setting
        
        float[] fractions = fill.getGradientFractions();
        Color[] colors = new Color[fractions.length];

        int i=0;
        for (ColorStyle fc : fill.getGradientColors()) {
            colors[i++] = applyColorTransform(fc);
        }

        return new PathGradientPaint(colors, fractions);
    }
    
    protected void snapToAnchor(Point2D p, Rectangle2D anchor) {
        if (p.getX() < anchor.getX()) {
            p.setLocation(anchor.getX(), p.getY());
        } else if (p.getX() > (anchor.getX() + anchor.getWidth())) {
            p.setLocation(anchor.getX() + anchor.getWidth(), p.getY());
        }

        if (p.getY() < anchor.getY()) {
            p.setLocation(p.getX(), anchor.getY());
        } else if (p.getY() > (anchor.getY() + anchor.getHeight())) {
            p.setLocation(p.getX(), anchor.getY() + anchor.getHeight());
        }
    }

    /**
     *  Convert HSL values to a RGB Color.
     *
     *  @param h Hue is specified as degrees in the range 0 - 360.
     *  @param s Saturation is specified as a percentage in the range 1 - 100.
     *  @param l Luminance is specified as a percentage in the range 1 - 100.
     *  @param alpha  the alpha value between 0 - 1
     *
     *  @returns the RGB Color object
     */
    private static Color HSL2RGB(double h, double s, double l, double alpha) {
        // we clamp the values, as it possible to come up with more than 100% sat/lum
        // (see links in applyColorTransform() for more info)
        s = Math.max(0, Math.min(100, s));
        l = Math.max(0, Math.min(100, l));

        if (alpha <0.0f || alpha > 1.0f) {
            String message = "Color parameter outside of expected range - Alpha: " + alpha;
            throw new IllegalArgumentException( message );
        }

        //  Formula needs all values between 0 - 1.

        h = h % 360.0f;
        h /= 360f;
        s /= 100f;
        l /= 100f;

        double q = (l < 0.5d)
            ? l * (1d + s)
            : (l + s) - (s * l);

        double p = 2d * l - q;

        double r = Math.max(0, HUE2RGB(p, q, h + (1.0d / 3.0d)));
        double g = Math.max(0, HUE2RGB(p, q, h));
        double b = Math.max(0, HUE2RGB(p, q, h - (1.0d / 3.0d)));

        r = Math.min(r, 1.0d);
        g = Math.min(g, 1.0d);
        b = Math.min(b, 1.0d);

        return new Color((float)r, (float)g, (float)b, (float)alpha);
    }

    private static double HUE2RGB(double p, double q, double h) {
        if (h < 0d) h += 1d;

        if (h > 1d) h -= 1d;

        if (6d * h < 1d) {
            return p + ((q - p) * 6d * h);
        }

        if (2d * h < 1d) {
            return q;
        }

        if (3d * h < 2d) {
            return p + ( (q - p) * 6d * ((2.0d / 3.0d) - h) );
        }

        return p;
    }


    /**
     *  Convert a RGB Color to it corresponding HSL values.
     *
     *  @return an array containing the 3 HSL values.
     */
    private static double[] RGB2HSL(Color color)
    {
        //  Get RGB values in the range 0 - 1

        float[] rgb = color.getRGBColorComponents( null );
        double r = rgb[0];
        double g = rgb[1];
        double b = rgb[2];

        //  Minimum and Maximum RGB values are used in the HSL calculations

        double min = Math.min(r, Math.min(g, b));
        double max = Math.max(r, Math.max(g, b));

        //  Calculate the Hue

        double h = 0;

        if (max == min) {
            h = 0;
        } else if (max == r) {
            h = ((60d * (g - b) / (max - min)) + 360d) % 360d;
        } else if (max == g) {
            h = (60d * (b - r) / (max - min)) + 120d;
        } else if (max == b) {
            h = (60d * (r - g) / (max - min)) + 240d;
        }

        //  Calculate the Luminance

        double l = (max + min) / 2d;

        //  Calculate the Saturation

        double s = 0;

        if (max == min) {
            s = 0;
        } else if (l <= .5d) {
            s = (max - min) / (max + min);
        } else {
            s = (max - min) / (2d - max - min);
        }

        return new double[] {h, s * 100, l * 100};
    }

}