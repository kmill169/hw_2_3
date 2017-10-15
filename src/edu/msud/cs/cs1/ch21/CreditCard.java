package edu.msud.cs.cs1.ch21;

public class CreditCard {

    public static void main(String[] args) {

        String ccNum  =  args[0];

        int sumOfDigits = 0;
        for ( int i = 0; i < ccNum.length(); i++ ) {
            if ( (i % 2) == 0) {
                //just add every other row
                sumOfDigits += Integer.parseInt(ccNum.substring(i, i+1));
            } else {
                //double every other row
                int doubleDigit = Integer.parseInt(ccNum.substring(i, i+1)) * 2;
                if (doubleDigit < 10) {
                    sumOfDigits += doubleDigit;
                } else {
                    // since doubling the digit resulted in a 2 digit result we must add those two digits together
                    String resultAsString = String.valueOf(doubleDigit);
                    int newSum = Integer.parseInt(resultAsString.substring(0,1)) + Integer.parseInt(resultAsString.substring(1,2));
                    sumOfDigits += newSum;
                }
            }
        }

        //calculate last digit by determining what is divisable by 10
        int checkSumAns = 9;
        int checkSumDigit = 0;
        while (checkSumAns != 0) {
            int newSum = sumOfDigits + checkSumDigit;
            checkSumAns = newSum % 10;
            if ( checkSumAns == 0 ) {
            } else {
                checkSumDigit++;
            }
        }
        System.out.println("Credit card with Checksum is: " + ccNum + checkSumDigit);

    }


}
