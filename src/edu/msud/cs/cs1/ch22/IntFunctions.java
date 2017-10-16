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

	public static void factors(int num) {
		System.out.println("Factors of " + num + " are: ");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

	public static void factors(long num) {
		System.out.println("Factors of " + num + " are: ");
		for(long i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

	public static int lcm(int num1, int num2) {
		int highNum = 0;
		if (num1 > num2) {
			highNum = num1;
		} else if (num2 > num1) {
			highNum = num2;
		} else {
			//numbers are equal
			return num1;
		}

		int cnt = highNum + 1;

		int lcm = 0;
		while (lcm == 0) {
			if ( ((cnt % num1) == 0 ) && ((cnt % num2) == 0) ) {
				lcm = cnt;
			} else {
				cnt++;
			}
		}

		return lcm;
	}

	public static int totient(int num) {
		int count = 0;
		for (int i= 2; i <num ; i++) {
			if (relativelyPrime(num, i)) {
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

		int intNum = 100;
		factors(intNum);
		long longNum = 100000;
		factors(longNum);

		System.out.println("LCM of 25 and 30 is: " + lcm(25,30));
		System.out.println("LCM of 15 and 25 is: " + lcm(15,25));
		System.out.println("LCM of 5 and 8 is: " + lcm(8,5));
		System.out.println("LCM of 10 and 10 is: " + lcm(10,10));

	}

}
