package edu.msud.cs.cs1.Comprehensive;

public class Parallelogram extends Geometric {

    protected double angleTheta;
    protected double a;
    protected double b;

    
    Parallelogram(double x, double y, double a, double b, double theta) {
    	super(x,y);
    	this.a = a;
    	this.b = b;
        this.angleTheta = theta;
    }



    
    @Override
    public double getArea() {
        return Math.sin(angleTheta) * a * b;
        
    }
    

    @Override
    public String toString() {
        return String.format("Parallelogram: x=%f y=%f a=%f b=%f theta=%f", x, y, a, b, angleTheta);
    }
}