package edu.msud.cs.cs1.ch22;

public class Matrix {

	public static double dot(double[] arrayInput1, double[] arrayInput2) {

		double sum = 0;
		for (int i = 0; i < arrayInput1.length; i++) {
			sum += arrayInput1[i] * arrayInput2[i];
		}
		return sum;

	}

	public static double[][] multiply(double[][] doubleArray1, double[][] doubleArray2) {

		double[][] answer = new double[doubleArray1.length][doubleArray2[0].length];

		for(int i = 0; i < doubleArray1.length; i++) {
			for (int j = 0; j < doubleArray2[0].length; j++) {
				for (int k = 0; k < doubleArray2.length; k++) {
					answer[i][j] += doubleArray1[i][k] * doubleArray2[k][j];
				}
			}
		}

		return answer;
	}

	public static double[][] transpose(double[][] doubleArray) {

		double[][] returnArray = new double[doubleArray[0].length][doubleArray.length];
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[0].length; j++) {
				returnArray[j][i] = doubleArray[i][j];
			}
		}

		return returnArray;

	}

	public static double[] multiply(double[][] doubleArray, double[] singleArray) {
		if (doubleArray[0].length != singleArray.length) throw new ArithmeticException("Num cols in Array1 does not match num rows in Array2");

		double[] answer = new double[doubleArray.length];

		for (int i=0; i < doubleArray.length; i++) {
			for (int j=0; j< doubleArray[0].length; j++) {
				answer[i] += doubleArray[i][j] * singleArray[j];
			}
		}

		return answer;
	}

	public static double[] multiply(double[] singleArray, double[][] doubleArray) {
		if (doubleArray[0].length != singleArray.length) throw new ArithmeticException("Num rows in Array1 does not match num cols in Array2");

		double[] answer = new double[singleArray.length];

		for (int j=0; j < doubleArray.length; j++) {
			for (int i=0; i < doubleArray[0].length; i++) {
				answer[j] += singleArray[i] * doubleArray[i][j];
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		double[] oneDimension1 = {1, 3, -5};
		double[] oneDimension2 = {4, -2, -1};
		System.out.println("Dot answer is: " + dot(oneDimension1, oneDimension2));

		System.out.println("******Transpose Array*********");
		double[][] twoDimension = { {1,2,3}, {9,8,7} };
		double[][] returnTwoDimension = transpose(twoDimension);
		for (int row = 0; row < returnTwoDimension.length; row++) {
			for (int col = 0; col < returnTwoDimension[0].length; col++) {
				System.out.print(returnTwoDimension[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("******multiply 2 by 1*********");
		double[] returnArray1 = multiply(twoDimension, oneDimension1);
		for (int i = 0; i < returnArray1.length; i++) {
			System.out.println(returnArray1[i]);
		}

		System.out.println("******multiply 1 by 2*********");
		double[][] twoDimension2 = { {1,2,3}, {9,8,7}, {6,5,4} };
		double[] returnArray2 = multiply(oneDimension1, twoDimension2);
		for (int i = 0; i < returnArray2.length; i++) {
			System.out.println(returnArray2[i]);
		}

		System.out.println("******multiply 2 by 2--1st version*********");
		double[][] twoDimensionx = { {3,-2,5}, {3,0,4} };
		double[][] twoDimensiony = { {2,3}, {-9,0}, {0,4} };
		double[][] returnArrayxy = multiply(twoDimensionx, twoDimensiony);
		for (int row = 0; row < returnArrayxy.length; row++) {
			for (int col = 0; col < returnArrayxy[0].length; col++) {
				System.out.print(returnArrayxy[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("******multiply 2 by 2*********");
		double[][] twoDimension3 = { {1,2}, {3,4} };
		double[][] twoDimension4 = { {1,1,1,1}, {2,2,2,2} };
		double[][] returnArray3 = multiply(twoDimension3, twoDimension4);
		for (int row = 0; row < returnArray3.length; row++) {
			for (int col = 0; col < returnArray3[0].length; col++) {
				System.out.print(returnArray3[row][col] + " ");
			}
			System.out.println();
		}



	}

}
