package edu.msud.cs.cs1.ch_3_2;

import edu.msud.cs.cs1.StdOut;

public class Harmonic211 {


    public Harmonic211(int num) {
        double value = harmonic(num);
        StdOut.println(value);
    }

    // returns 1/1 + 1/2 + 1/3 + ... + 1/n
    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {

    }

}