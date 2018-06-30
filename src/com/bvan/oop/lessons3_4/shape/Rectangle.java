package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Rectangle implements PrintableShape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0) {
            throw new IllegalStateException("not positive width: " + width);
        }
        if (height <= 0) {
            throw new IllegalStateException("not positive height: " + height);
        }
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void printIntoConsole() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
