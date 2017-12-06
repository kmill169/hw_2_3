package edu.msud.cs.cs1.Comprehensive;

public class Circle extends Elipsoid {

    Circle(double x, double y, double r) { 
    	super(x, y, r, r); 
    }

    @Override
    public String toString() {
    	
    	
    	//System.out.println(super.getNumShapes());
        return String.format("Circle: x=%f y=%f r=%f", x, y, semiMajor);

    }


}