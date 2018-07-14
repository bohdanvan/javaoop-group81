package com.bvan.oop.lessons7_8.generics.box;

/**
 * @author bvanchuhov
 */
public class Box<T> { // T - type parameter

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public T[] create() {
        return (T[]) new Object[10];
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
