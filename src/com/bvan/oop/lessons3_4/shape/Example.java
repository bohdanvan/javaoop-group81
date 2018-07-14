package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Example {

    public static void main(String[] args) {
        Shape s = new Rectangle(10, 20);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 20));
        shapes.add(new Circle(10));


    }
}
