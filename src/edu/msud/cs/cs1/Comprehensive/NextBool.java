package edu.msud.cs.cs1.Comprehensive;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class NextBool {

    public static void main(String[] args) {
        String inputStr = "1 0 true false True False TRUE FALSE 234 t f T F trUE fALsE";
        //String inputStr = "true false True False TRUE FALSE trUE fALsE";
        Scanner input = new Scanner(inputStr);

        // TODO: write your code here
        
        while (input.hasNext()) {
        
        	
        	try {
        		System.out.println(input.nextBoolean());
        	} catch (InputMismatchException e) {
        		System.out.println("Error: null");
        		//read past non boolean data
        		input.next();
        	}
        	
        }
        }
    }