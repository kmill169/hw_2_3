package edu.msud.cs.cs1.ch21;

public class Calendar {

    public static void main(String[] args) {
        int month  =  Integer.valueOf(args[0]);
        int ccyy  =  Integer.valueOf(args[1]);

        String monthText = new String();
        int numDays = 0;
        switch (month) {
            case 1:
                monthText="January ";
                numDays = 31;
                break;
            case 2:
                monthText="Febuary ";
                numDays = 28;
                break;
            case 3:
                monthText="March ";
                numDays = 31;
                break;
            case 4:
                monthText="April ";
                numDays = 30;
                break;
            case 5:
                monthText="May ";
                numDays = 31;
                break;
            case 6:
                monthText="June ";
                numDays = 30;
                break;
            case 7:
                monthText="July ";
                numDays = 31;
                break;
            case 8:
                monthText="August ";
                numDays = 31;
                break;
            case 9:
                monthText="September ";
                numDays = 30;
                break;
            case 10:
                monthText="October ";
                numDays = 31;
                break;
            case 11:
                monthText="November ";
                numDays=30;
                break;
            case 12:
                monthText="December ";
                numDays=31;
                break;
        }

        //check for leap year
        if (numDays == 28) {
            boolean isLeapYear;
            isLeapYear = (ccyy % 4 == 0);
            isLeapYear = isLeapYear && (ccyy % 100 !=0);
            isLeapYear = isLeapYear || (ccyy % 400 == 0);
            if (isLeapYear) {
                numDays = 29;
            }
        }

        // print month and year
        System.out.println(monthText + ccyy);

        // print days of week grid
        System.out.println(" S  M TU  W TH  F  S");

        // calculate starting day of the week for the given month and year
        int yZero = ccyy - (14 - month) /12;
        int x = yZero + yZero / 4 - yZero / 100 + yZero / 400;
        int mZero = month + 12 * ((14 - month) / 12) -2;
        int dZero = (1 + x + (31 * mZero) / 12) % 7;

        //pad initial spaces (3 per day)
        for (int i = 0; i < dZero; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= numDays; i++) {
            // add an extra space for 1 digit days
            if (i < 10) {
                System.out.print(" ");
            }
            if (dZero < 6) {
                System.out.print(i + " ");
                dZero++;
            } else {
                //print Saturday and return to next line for Sunday
                System.out.println(i);
                dZero = 0;
            }
        }
    }
}
