package edu.msud.cs.cs1.Comprehensive;

public class Rhombus extends Parallelogram {

    
    Rhombus(double x, double y, double side, double theta) {
    	super(x,y,side,side,theta);
    }



    
    @Override
    public double getArea() {
    	
    	//area = Side ^2  * sin(angle)
        return Math.sin(angleTheta) * a * a;
        
    }
    

    @Override
    public String toString() {
        return String.format("Rhombus: x=%f y=%f side=%f theta=%f", x, y, a, angleTheta);
    }
}