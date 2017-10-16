package edu.msud.cs.cs1.ch22;

public class IntFunctionsAPI {
	
	public static void main(String[] args) {	 
	
		//Stress test is prime from 1 to 10,000
		for (long i = 0; i <= 10000; i++) {
			System.out.println("is prime long " + i + " " + IntFunctions.isPrime(i));
		}
	 
		System.out.println("relative prime 3, 7 " + IntFunctions.relativelyPrime(3, 7));
	
		
		System.out.println("totient for 10 " + IntFunctions.totient(10));
		System.out.println("totient for 12 " + IntFunctions.totient(12));
		System.out.println("relative prime 12, 7 " + IntFunctions.relativelyPrime(12, 7));
		System.out.println("relative prime 12, 11 " + IntFunctions.relativelyPrime(12, 11));
		
		int intNum = 100;
		IntFunctions.factors(intNum);
		long longNum = 100000;
		IntFunctions.factors(longNum);
		
		System.out.println("LCM of 25 and 30 is: " + IntFunctions.lcm(25,30));


	} 
	
}
