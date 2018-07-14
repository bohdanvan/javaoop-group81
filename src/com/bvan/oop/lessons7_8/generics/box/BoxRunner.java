package com.bvan.oop.lessons7_8.generics.box;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<String> nameBox = new Box<>("Ivan");

        Box<List<String>> namesBox = new Box<>(new ArrayList<>());

        Box<Box<String>> a;


    }
}

//class MultipleBox {
//    private final List<Box<Cat>> catBoxes;
//    private final List<Box<Dog>> dogBoxes;
//}