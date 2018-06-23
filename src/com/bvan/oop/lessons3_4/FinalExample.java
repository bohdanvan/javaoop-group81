package com.bvan.oop.lessons3_4;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class FinalExample {

    public static void main(String[] args) {
        final int x = 10;
        final String s = "Hello";

        final ArrayList<String> names = new ArrayList<>();

//        names = new ArrayList<>();

        names.add("Ivan");

        System.out.println(names);
    }
}
