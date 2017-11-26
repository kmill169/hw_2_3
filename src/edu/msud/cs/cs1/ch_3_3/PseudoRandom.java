package edu.msud.cs.cs1.ch_3_3;

import java.math.BigInteger;

public class PseudoRandom {

    private static BigInteger a =  new BigInteger("3141592621");
    private static BigInteger b = new BigInteger("2718281829");
    private int x = 1;

    public PseudoRandom() {

    }

    public PseudoRandom(int initialValue) {
        this.x = initialValue;
    }

    public int random() {


        BigInteger xToBigInteger = new BigInteger ( new Integer(x).toString() );



        BigInteger valueAsBigInteger = a.multiply(xToBigInteger).add(b);

        x = valueAsBigInteger.intValue();

        return x;

    }


    public static void main(String[] args) {


        PseudoRandom ran1 = new PseudoRandom(44);
        PseudoRandom ran2 = new PseudoRandom();
        PseudoRandom ran3 = new PseudoRandom(44);

        System.out.println(ran1.random());
        System.out.println(ran1.random());
        System.out.println(ran2.random());
        System.out.println(ran3.random());


    }
}