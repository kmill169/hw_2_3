package edu.msud.cs.cs1.ch15;

import edu.msud.cs.cs1.StdDraw;
import edu.msud.cs.cs1.StdIn;

public class Histogram {

    public static void main(String[] args) {

        int intervals  =  Integer.valueOf(args[0]);
        double lo  =  Double.valueOf(args[1]);
        double hi  =  Double.valueOf(args[2]);

        double range = hi - lo;
        double intervalLength = range / intervals;

        int[] intervalCount = new int[intervals];

        // collect the doubles entered from the user
        System.out.println("Enter a series of doubles.  Enter ctrl-d at end.");
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            if ( (value >= lo) && (value <=hi) ) {
                //count this value in correct range
                double hiRange = lo + intervalLength;
                for (int i = 0 ; i < intervals; i++) {
                    if (value <= hiRange) {
                        intervalCount[i]++;
                        break;
                    }
                    hiRange = hiRange + intervalLength;
                }
            }
        }

        //get max interval count
        int maxCount = 0;
        for (int i = 0; i < intervalCount.length; i++) {
            if (intervalCount[i] > maxCount) {
                maxCount = intervalCount[i];
            }
        }

        // draw histogram
        StdDraw.setPenRadius(.025);
        StdDraw.setXscale(0, intervals);
        StdDraw.setYscale(0, maxCount);
        for (int i = 0; i < intervals; i++) {
            StdDraw.line(i, 0, i, intervalCount[i]);
        }

    }
}
