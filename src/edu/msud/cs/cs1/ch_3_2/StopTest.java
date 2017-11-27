package edu.msud.cs.cs1.ch_3_2;

public class StopTest {

    public static void main(String[] args) {

        Stopwatch stop1 = new Stopwatch();

        Harmonic211 harmonic211 = new Harmonic211(50000);

        System.out.println("run 1 is: " + stop1.elapsedTime());
        stop1.restart();
        HarmonicNumber135 harmonicNumber135 = new HarmonicNumber135(50000);
        System.out.println("run 2 is: " + stop1.elapsedTime());
    }

}
