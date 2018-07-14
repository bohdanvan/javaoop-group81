package com.bvan.oop.lessons7_8.generics.pair;

import com.bvan.oop.lessons5_6.format.oop.Formatter;

/**
 * @author bvanchuhov
 */
public class Pair<L, R extends Number> {

    private final L left;
    private final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}