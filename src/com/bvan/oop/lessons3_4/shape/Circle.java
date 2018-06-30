package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalStateException("not positive radius: " + radius);
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
