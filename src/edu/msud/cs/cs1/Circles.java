package edu.msud.cs.cs1;

import edu.princeton.cs.introcs.StdDraw;

public class Circles {

    public static void main(String[] args) {

        int numCircles = Integer.parseInt(args[0]);
        double probBlack = Double.parseDouble(args[1]);

        double rMin = Double.parseDouble(args[2]);
        double rMax = Double.parseDouble(args[3]);

        for (int i = 1; i <= numCircles; i++) {
            double r = Math.random() * (rMax - rMin) + rMin;
            if (Math.random() > probBlack) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledCircle(Math.random(), Math.random(), r);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(Math.random(), Math.random(), r);
            }
        }
    }
}
