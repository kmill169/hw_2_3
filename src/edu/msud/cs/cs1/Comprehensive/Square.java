package edu.msud.cs.cs1.Comprehensive;

public class Square extends Rectangle {

    
    Square(double x, double y, double side) {   	
    	super(x,y,side,side);
    }

    

    @Override
    public String toString() {
        return String.format("Square: x=%f y=%f side=%f theta=%f", x, y, a, angleTheta);
    }
}