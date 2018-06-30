package com.bvan.oop.lessons3_4;

/**
 * @author bvanchuhov
 */
public class EarlyBinding {

    public static void main(String[] args) {
        int x = sum(10, 20);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
