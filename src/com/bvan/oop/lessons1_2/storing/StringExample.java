package com.bvan.oop.lessons1_2.storing;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(", world");
        System.out.println(s); // Hello, world
    }
}
