package models;

import java.lang.Math;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point another) {
        return Math.sqrt(
                Math.pow(this.getX() - another.getX(), 2) +
                        Math.pow(this.getY() - another.getY(), 2)
        );
    }

    public String toString() {
        return "Point at x: " + String.valueOf(x) + " y: " + String.valueOf(y) + '\n';
    }
}