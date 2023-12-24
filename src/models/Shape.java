package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public void addPoint(Point a) {
        points.add(a);
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            perimeter += currentPoint.distance(nextPoint);
        }

        return perimeter;
    }

    public double getLongest() {
        double longestSide = 0;

        for (int i = 0; i < points.size(); i++) {
            double sideLength = points.get(i).distance(points.get((i + 1) % points.size()));
            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }

        return longestSide;
    }

    public double getAverageSide() {
        double totalSideLength = calculatePerimeter();
        return totalSideLength / points.size();
    }
}