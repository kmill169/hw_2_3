package edu.msud.cs.cs1.ch_2_3;

import edu.msud.cs.cs1.StdOut;
class Permutations {

    // print n! permutation
    public static void permutation(String s) {
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);
        permutation(a, n);
    }

    private static void permutation(char[] a, int n) {
        if (n == 1) {
            StdOut.println(new String(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            permutation(a, n-1);
            swap(a, i, n-1);
        }
    }

    //swap the characters
    private static void swap(char[] charArray, int startIndex, int endIndex) {
        char c = charArray[startIndex];
        charArray[startIndex] = charArray[endIndex];
        charArray[endIndex] = c;
    }

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int numberLength = Integer.parseInt(args[0]);
        permutation(alphabet.substring(0, numberLength));

    }
}
