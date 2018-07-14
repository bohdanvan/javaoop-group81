package com.bvan.oop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class IntegerExample {

    public static void main(String[] args) {
        // < Java 5
        Integer x = Integer.valueOf(10);
        Integer y = Integer.valueOf(20);
        Integer z = Integer.valueOf(x.intValue() + y.intValue());
        System.out.println(z);

        // ------

        Integer a = 10; // int -> Integer (autoboxing)
        Integer b = 20;
        Integer c = a + b;
        System.out.println(c);
    }
}
