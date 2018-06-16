package com.bvan.oop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    int size = 0;
    int[] elems = new int[4];

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int)(1.5 * elems.length);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
