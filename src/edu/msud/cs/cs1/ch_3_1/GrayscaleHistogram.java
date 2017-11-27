package edu.msud.cs.cs1.ch_3_1;

import edu.msud.cs.cs1.StdDraw;
import edu.msud.cs.cs1.Picture;
import edu.msud.cs.cs1.Luminance;
import java.awt.Color;

public class GrayscaleHistogram {
    private int[] grayscaleCounts;
    private int maxCount = 0;
    // other data members to hold the histogram

    public GrayscaleHistogram(String imgFilename) {
        grayscaleCounts = new int[256]; // grayscale shades are from 0 (black) to 255 (white)

        Picture picture = new Picture(imgFilename);
        for (int col = 0; col < picture.width(); col++) {
            for (int row = 0; row < picture.height(); row++) {
                Color color = picture.get(col, row); // count each pixel of the image
                Color gray = Luminance.toGray(color); // convert to grayscale (does nothing if already grayscale)

                // Note: The gray Color contains three equal values (see Luminance.java), so you can get any one of them
                grayscaleCounts[gray.getBlue()]++; // count the occurrence of the found value (in grayscale, R=G=B=Y, where Y is the monochrome luminance)
            }
        }


        constructHistogram();
        printHistogram();
    }

    private void constructHistogram() {
        //get max interval count

        for (int i = 0; i < grayscaleCounts.length; i++) {
            if (grayscaleCounts[i] > maxCount) {
                maxCount = grayscaleCounts[i];
            }
        }


    }

    public void printHistogram() {
        // draw histogram
        StdDraw.setPenRadius(.025);
        StdDraw.setXscale(0, grayscaleCounts.length+1);
        StdDraw.setYscale(0, maxCount);
        for (int i = 0; i < grayscaleCounts.length; i++) {
            StdDraw.line(i, 0, i, grayscaleCounts[i]);
        }
    }

    public static void main(String[] args) {
        GrayscaleHistogram myHist = new GrayscaleHistogram(args[0]);
    }
}