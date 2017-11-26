package edu.msud.cs.cs1.ch_3_3;

import java.util.Objects;
import edu.msud.cs.cs1.StdOut;

public class Vector {

    private final double[] coords;

    public Vector(double[] a) {
        coords = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            coords[i] = a[i];
        }
    }

    public Vector plus(Vector that) {

        if (this.coords.length != that.coords.length) {
            throw new IllegalArgumentException("vectors are different sizes");
        }

        double[] result = new double[coords.length];
        for (int i = 0; i < coords.length; i++) {
            result[i] = this.coords[i] + that.coords[i];
        }
        return new Vector(result);
    }

    public Vector minus(Vector that) {

        if (this.coords.length != that.coords.length) {
            throw new IllegalArgumentException("vectors are different sizes");
        }

        double[] result = new double[coords.length];
        for (int i = 0; i < coords.length; i++) {
            result[i] = this.coords[i] - that.coords[i];
        }
        return new Vector(result);
    }

    public Vector scale(double alpha) {
        double[] result = new double[coords.length];
        for (int i = 0; i < coords.length; i++) {
            result[i] = alpha * coords[i];
        }
        return new Vector(result);
    }

    public double dot(Vector that) {

        if (this.coords.length != that.coords.length) {
            throw new IllegalArgumentException("vectors are different sizes");
        }

        double sum = 0.0;
        for (int i = 0; i < coords.length; i++) {
            sum += this.coords[i] * that.coords[i];
        }
        return sum;
    }

    public double magnitude() {
        return Math.sqrt(this.dot(this));
    }

    public Vector direction() {
        return this.scale(1/this.magnitude());
    }

    public double cartesian(int i) {
        return coords[i];
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("(");
        for (int i = 0; i < coords.length; i++) {
            s.append(coords[i]);
            if (i < coords.length-1) s.append(", ");
        }
        s.append(")");
        return s.toString();
    }

    public double kineticEnergy(double mass) {

        if (this.coords.length != 3) {
            throw new IllegalArgumentException("vectors must contain 3 elements");
        }

        double x = 0.0;

        x = .5 * mass * ( (coords[0] * coords[0]) + (coords[1] * coords[1]) + (coords[2] * coords[2]) );

        return x;
    }

    public boolean equals(Vector that) {

        boolean same = true;

        if (this.coords.length == that.coords.length) {
            for (int i = 0; i < this.coords.length; i++) {
                if (this.coords[i] != that.coords[i]) {
                    same = false;
                    break;
                }
            }
        } else {
            same = false;
        }

        return same;

    }

    public int hashCode() {

        double sum = 0.0;

        for (int i = 0; i < coords.length; i++) {
            sum += coords[i];
        }
        return Objects.hash(sum);
    }

    public static void main(String[] args) {
        double[] xdata = { 1.0, 2.0, 3.0};
        double[] ydata = { 4.0, 3.0, 2.0};

        Vector x = new Vector(xdata);
        Vector y = new Vector(ydata);
        Vector z = new Vector(xdata);

        StdOut.println("x      =  " + x);
        StdOut.println("y      =  " + y);
        StdOut.println("x + y  =  " + x.plus(y));
        StdOut.println("x - y  =  " + x.minus(y));
        StdOut.println("|x|    =  " + x.magnitude());
        StdOut.println("<x, y> =  " + x.dot(y));

        StdOut.println(x.equals(y));
        StdOut.println(x.equals(z));

        StdOut.println(x.hashCode());
        StdOut.println(y.hashCode());
        StdOut.println(z.hashCode());
    }
}