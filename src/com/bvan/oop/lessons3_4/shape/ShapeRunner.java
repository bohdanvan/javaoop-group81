package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        System.out.println(r.getArea()); // 200

        Circle c = new Circle(10);
        System.out.println(c.getArea()); // 314

        Shape s = new Circle(10);
        System.out.println(s.getArea()); // 314

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(5));

        System.out.println("--------------");

        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) { // BAD PRACTICE
            Rectangle rectangle = (Rectangle) shape; // BAD PRACTICE
            System.out.println("width = " + rectangle.getWidth());
        }

        System.out.println("--------------");

        double totalArea = totalArea(shapes);
        System.out.println("area = " + totalArea);

        printInfo(new Rectangle(10, 5));
    }

    public static void printInfo(PrintableShape printableShape) {
        printableShape.printIntoConsole();
        System.out.println("S = " + printableShape.getArea());
        System.out.println("P = " + printableShape.getPerimeter());
    }

    public static double totalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

}
