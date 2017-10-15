package edu.msud.cs.cs1.ch22;

public class Matrix {
	
	public static double dot(double[] a, double[] b) {
		
		double sum = 0;
	    for (int i = 0; i < a.length; i++) {
	      sum += a[i] * b[i];
	    }
	    return sum;
	    
	}
	
	public static double[][] multiply(double[][] a, double[][] b) {
		//pg 109 ---> square matrix multiplication
		
		double[][] answer = new double[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j=0; j < a[0].length; j++){
				answer[i][j] = a[i][j] * b[i][j];
			}
		}
		
		return answer;
	}
	
	public static double[][] transpose(double[][] a) {
        
        double[][] returnArray = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                returnArray[j][i] = a[i][j];
            }
		}
	
        return returnArray;

	}
	
	public static double[] multiply(double[][] a, double[] x) {
		//pg 110
		double[] answer = new double[a.length];
		
		for (int i=0; i < a.length; i++) {
			for (int j=0; j< a[0].length; j++) {
				answer[i] = a[i][j] * x[j];
			}
		}
		
		return answer;
	}
	
	public static double[] multiply(double[] a, double[][] x) {
		//pg 110
		double[] answer = new double[a.length];
		
		for (int j=0; j < x.length; j++) {
			for (int i=0; i < x[0].length; i++) {
				answer[j] += a[i] * x[i][j];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {	 
		
	} 
	
}
