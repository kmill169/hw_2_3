package edu.msud.cs.cs1.ch22;

import edu.msud.cs.cs1.StdOut;


public class Hyperbolic {

    public static double sinh(double inputNumber) {
        return (Math.exp(inputNumber) - Math.exp(-inputNumber)) / 2.0;
    }

    public static double cosh(double inputNumber) {
        return (Math.exp(inputNumber) + Math.exp(-inputNumber)) / 2.0;
    }

    public static double tanh(double inputNumber) {
        if (cosh(inputNumber) == 0.0) throw new ArithmeticException("error: division by zero attempted");
        return sinh(inputNumber) / cosh(inputNumber);
    }

    public static double coth(double inputNumber) {
        if (inputNumber == 0.0) throw new ArithmeticException("input cannot be zero");
        if (sinh(inputNumber) == 0.0) throw new ArithmeticException("error: division by zero attempted");
        return cosh(inputNumber) / sinh(inputNumber);
    }

    public static double sech(double inputNumber) {
        if (cosh(inputNumber) == 0.0) throw new ArithmeticException("error: division by zero attempted");
        return 1 / cosh(inputNumber);
    }

    public static double csch(double inputNumber)  {
        if (inputNumber == 0.0) throw new ArithmeticException("input cannot be zero");
        if (sinh(inputNumber) == 0.0) throw new ArithmeticException("error: division by zero attempted");
        return 1 / sinh(inputNumber);
    }

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        StdOut.printf("sinh(%f) = %f\n", x, sinh(x));
        StdOut.printf("cosh(%f) = %f\n", x, cosh(x));
        StdOut.printf("tanh(%f) = %f\n", x, tanh(x));
        StdOut.printf("coth(%f) = %f\n", x, coth(x));
        StdOut.printf("sech(%f) = %f\n", x, sech(x));
        StdOut.printf("csch(%f) = %f\n", x, csch(x));

    }

}
