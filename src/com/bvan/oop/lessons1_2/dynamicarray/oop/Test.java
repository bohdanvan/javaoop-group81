package com.bvan.oop.lessons1_2.dynamicarray.oop;

/**
 * @author bvanchuhov
 */
public class Test {

    public static void main(String[] args) {
        DynamicArray a = new DynamicArray();
        DynamicArray b = new DynamicArray();

        a.addLast(10);
        a.addLast(20);
        a.addLast(50);

        b.addLast(70);
        b.addLast(-100);

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
