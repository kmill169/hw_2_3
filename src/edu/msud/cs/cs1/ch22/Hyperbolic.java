package edu.msud.cs.cs1.ch22;

import edu.msud.cs.cs1.StdOut;

public class Hyperbolic {
	
	public static double sinh(double x) {
        return (Math.exp(x) - Math.exp(-x)) / 2.0;
    }
	
	public static double cosh(double x) {
        return (Math.exp(x) + Math.exp(-x)) / 2.0;
    }

    public static double tanh(double x) {
        return sinh(x) / cosh(x);
    }
    
    public static double coth(double x) {
    	return cosh(x) / sinh(x);
    }
    
    public static double sech(double x) {
    	return 1 / cosh(x);
    }
    
    public static double csch(double x) {
    	return 1 / sinh(x);
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
