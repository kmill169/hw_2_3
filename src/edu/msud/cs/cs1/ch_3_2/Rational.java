package edu.msud.cs.cs1.ch_3_2;

public class Rational {

    private final int num;
    private final int den;

    Rational(int numerator, int denominator) {
        this.num = numerator;
        this.den = denominator;

    }

    Rational plus(Rational b) {
        int newNum = (num * b.den) + (den * b.num);
        int newDen = den * b.den;
        return new Rational(newNum, newDen);
    }

    Rational minus(Rational b) {
        int newNum = (num * b.den) - (den * b.num);
        int newDen = den * b.den;
        return new Rational(newNum, newDen);
    }

    Rational times(Rational b) {
        int newNum = (num * b.num);
        int newDen = den * b.den;
        return new Rational(newNum, newDen);
    }

    Rational divides(Rational b) {
        int newNum = (num * b.den);
        int newDen = den * b.num;
        return new Rational(newNum, newDen);
    }


    public String toString() {
        return num + "/" + den;
    }

    public static void main(String[] args) {

        Rational rat1 = new Rational(2,3);
        Rational rat2 = new Rational(2,3);

        rat1 = rat1.plus(rat2);

        System.out.println(rat1.toString());
        System.out.println(rat2.toString());


    }
}