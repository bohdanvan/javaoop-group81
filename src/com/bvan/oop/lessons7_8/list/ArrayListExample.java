package com.bvan.oop.lessons7_8.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list.size());
        System.out.println(list);

        int[] a = new int[10];
        a[5] = 500;
    }
}
