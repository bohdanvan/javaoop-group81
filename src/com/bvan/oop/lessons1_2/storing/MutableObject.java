package com.bvan.oop.lessons1_2.storing;

import com.bvan.oop.lessons1_2.dynamicarray.oop.DynamicArray;

/**
 * @author bvanchuhov
 */
public class MutableObject {

    public static void main(String[] args) {
        DynamicArray a = new DynamicArray();
        a.addLast(10);

        DynamicArray b = a;
        b.addLast(20);

        System.out.println(a.toString());
        System.out.println(b.toString());

        a.addLast(30);
        System.out.println(b.toString());
    }
}
