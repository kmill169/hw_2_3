package edu.msud.cs.cs1.ch22;

public class IntFunctions {

    public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isPrime(long num) {	
		for (long i = 2; i < num; i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static int gcd(int a, int b) {
	    int t;
	    while(b != 0){
	        t = a;
	        a = b;
	        b = t%b;
	    }
	    return a;
	}
	
	public static long gcd(long a, long b) {
	    long t;
	    while(b != 0){
	        t = a;
	        a = b;
	        b = t%b;
	    }
	    return a;
	}
	
	// if the greatest common denominator is 1 then they are relatively prime	
	public static boolean relativelyPrime(int a, int b) {
	    return gcd(a,b) == 1;
	}
	
	public static boolean relativelyPrime(long a, long b) {
	    return gcd(a,b) == 1;
	}
	
	public static void factors(int a) {
		
	}
	
	public static int gcdlcm(int a, int b) {
		return 0;
	}
	
	public static int totient(int num) {
        int count = 0;
        for (int i= 2; i <num ; i++) {
        	if (relativelyPrime(num, i)) {
        		//System.out.println("rel " + num + " " + i);
        		count++;
        	}
        }
        return count;
    }
	
	public static void main(String[] args) {	 
		
		long long7 = 7;
		int int7 = 7;
		
		System.out.println("is prime long 7 " + isPrime(long7));
		System.out.println("is prime int 7 " + isPrime(int7));
		
		System.out.println("relative prime 3, 7 " + relativelyPrime(3, 7));
		System.out.println("relative prime 6, 8 " + relativelyPrime(6, 8));
		
		System.out.println("totient for 10 " + totient(10));
		System.out.println("totient for 12 " + totient(12));
		System.out.println("relative prime 12, 7 " + relativelyPrime(12, 7));
		System.out.println("relative prime 12, 11 " + relativelyPrime(12, 11));
		
	} 
	
}
