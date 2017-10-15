package edu.msud.cs.cs1.ch15;

import edu.msud.cs.cs1.StdDraw;

public class Circles {

    public static void main(String[] args) {

        //get java arguments
        int numCircle = Integer.parseInt(args[0]);
        double percent = Double.parseDouble(args[1]);
        double minRadius = Double.parseDouble(args[2]);
        double maxRadius = Double.parseDouble(args[3]);


        for (int i = 0; i < numCircle; i++ ) {
            double ran1 = .1 +  (Math.random() * .9);
            double ran2 = .1 +  (Math.random() * .9);

            double ranColor = 0 +  (Math.random() * 1);
            if (ranColor <= percent) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.MAGENTA);
            }

            double radius = (Math.random()*(maxRadius - minRadius)) + minRadius;

            StdDraw.filledCircle(ran1, ran2, radius);

        }

    }


}
