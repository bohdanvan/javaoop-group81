package com.bvan.oop.lessons1_2.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MutablePractice {

    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b = a;

        b = new int[]{40, 50};

        System.out.println(Arrays.toString(a)); //
    }
}
