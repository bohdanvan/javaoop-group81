package com.bvan.oop.lessons9_10.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Long.compare(40, 30)); // > 0

        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Bohdan".compareTo("Vova")); // < 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println("Home".compareTo("Home")); // 0
    }
}
