package com.group_finity.mascot.win.jna;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Original Author: Yuki Yamada of Group Finity (http://www.group-finity.com/Shimeji/)
 * Currently developed by Shimeji-ee Group.
 */

public class BITMAPINFOHEADER extends Structure {
    public int biSize;
    public int biWidth;
    public int biHeight;
    public short biPlanes;
    public short biBitCount;
    public int biCompression;
    public int biSizeImage;
    public int biXPelsPerMeter;
    public int biYPelsPerMeter;
    public int biClrUsed;
    public int biClrImportant;

    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[] {"biSize", "biWidth", "biHeight", "biPlanes", "biBitCount", "biCompression", "biSizeImage", "biXPelsPerMeter", "biYPelsPerMeter", "BiClrUsed", "BiClrImportant"});
    }
}
