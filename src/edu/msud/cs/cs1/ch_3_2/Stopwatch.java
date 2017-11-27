package edu.msud.cs.cs1.ch_3_2;

import edu.msud.cs.cs1.StdOut;


public class Stopwatch {

    private long startTime;
    private long endTime;
    private long elapsedTime;



    public Stopwatch() {
        reset();
        startTime = System.currentTimeMillis();
        elapsedTime = 0;
    }

    public void reset() {
        startTime = 0;
        endTime = 0;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        calculateElapsedTime();
        reset();
    }

    public void calculateElapsedTime() {

        long lapElapsedTime = endTime - startTime;
        elapsedTime += lapElapsedTime;

    }

    public void restart() {
        reset();
        startTime = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long thisRun = 0;
        if (startTime > 0) {
            long now = System.currentTimeMillis();
            thisRun = now - startTime;
        }

        return ( thisRun  + elapsedTime ) / 1000.0;
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        Stopwatch timer1 = new Stopwatch();
        double sum1 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum1 += Math.sqrt(i);
        }
        double time1 = timer1.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum1, time1);

        timer1.stop();
        timer1.restart();

        Stopwatch timer2 = new Stopwatch();
        double sum2 = 0.0;
        for (int i = 1; i <= n; i++) {
            sum2 += Math.sqrt(i);
        }
        double time2 = timer2.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum2, time2);

        time1 = timer1.elapsedTime();

        StdOut.printf("%e (%.2f seconds)\n", sum2, time1);
    }
}
