package com.bvan.oop.lessons1_2.storing;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class ImmutablePractice {

    public static void main(String[] args) {
        BigInteger x = BigInteger.ONE;

        BigInteger y = x;

        y = null;

        System.out.println(x);
        System.out.println(y);
    }
}
