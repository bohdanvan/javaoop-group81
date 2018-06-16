package com.bvan.oop.lessons1_2.test;

/**
 * @author bvanchuhov
 */
public class Increment {

    public static void main(String[] args) {
        int x = 10;
        int y = x++;

        System.out.println("x = " + x + ", y = " + y); // x = 11, y = 10

        int z = ++x;
        System.out.println("x = " + x + ", z = " + z); // x = 12, z = 12
    }
}
