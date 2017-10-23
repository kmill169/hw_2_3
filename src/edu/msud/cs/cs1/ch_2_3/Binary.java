package edu.msud.cs.cs1.ch_2_3;

class Binary {

    public static String StringToBinary(int number) {
        String outNumber = new String();

        while (number > 0) {

            int digit = number % 2;

            outNumber = outNumber + digit;

            //keep dividing by base until number is < 0;
            number = number / 2;
        }

        return outNumber;
    }

    public static void reverseAndPrintString(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverseAndPrintString(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args) {

        String binaryNumberReversed;
        binaryNumberReversed = StringToBinary(Integer.parseInt(args[0]));

        reverseAndPrintString(binaryNumberReversed);

    }
}
