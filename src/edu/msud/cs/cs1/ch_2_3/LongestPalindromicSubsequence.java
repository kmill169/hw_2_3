package edu.msud.cs.cs1.ch_2_3;

// Java Solution
public class LongestPalindromicSubsequence
{

    public static void longestPalindromicSubstring(String inputString) {

        int inputStringLength = inputString.length();

        //create 2 dimensional table of string length
        boolean stringTable[][] = new boolean[inputStringLength][inputStringLength];

        // set all single strings to true
        int maxPalindromeLength = 1;
        for (int i = 0; i < inputStringLength; ++i) {
            stringTable[i][i] = true;
        }

        // check for 2 character palindrome
        int start = 0;
        for (int i = 0; i < inputStringLength - 1; ++i) {
            if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                stringTable[i][i + 1] = true;
                start = i;
                maxPalindromeLength = 2;
            }
        }

        // check for 3+ character palindrome
        for (int i = 3; i <= inputStringLength; ++i) {
            for (int j = 0; j < inputStringLength - i + 1; ++j) {
                //ending index of substring
                int endingStringIndex = j + i - 1;

                //check for palindrome
                if (stringTable[j + 1][endingStringIndex - 1] && inputString.charAt(j) == inputString.charAt(endingStringIndex)) {
                    stringTable[j][endingStringIndex] = true;
                    if (i > maxPalindromeLength) {
                        start = j;
                        maxPalindromeLength = i;
                    }
                }
            }
        }
        System.out.println("Longest palindromic subsequence is: " + inputString.substring(start, start + maxPalindromeLength));
    }

    public static void main(String[] args) {

        longestPalindromicSubstring(args[0]);
    }
}