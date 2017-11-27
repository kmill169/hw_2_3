package edu.msud.cs.cs1.ch_3_2;



public class Interval {

    private final double min;
    private final double max;

    Interval(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(double x) {
        if (x >= min && x <= max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean intersects(Interval b ) {
        if (this.max < b.min)  {
            return false;
        } else {
            if (b.max < this.min) {
                return false;
            } else {
                return true;
            }
        }
    }

    public String toString() {
        return "min: " + this.min + " max: " + this.max;
    }

    public static void main(String[] args) {


        Interval int1 = new Interval(2.2, 5.5);
        Interval int2 = new Interval(2.6, 4.5);
        Interval int3 = new Interval(8.8, 9.9);

        System.out.println(int2.contains(3.3));
        System.out.println(int2.contains(7.3));
        System.out.println(int1.intersects(int2));
        System.out.println(int1.intersects(int3));


    }
}