package edu.msud.cs.cs1.ch_3_2;

public class HarmonicNumber135 {

    public static int n = 0;

    public HarmonicNumber135(int num) {
        n = num;
        double sum = 0.0;
        for (int i = 1; i <=n; i++) {
            sum += 1.0/i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

    }
}