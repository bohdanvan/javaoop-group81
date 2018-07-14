package com.bvan.oop.lessons7_8.generics;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        A a = new A();
        A b = new A();

        String s = a.toString();
        System.out.println(s);

        System.out.println(a.equals(b)); // ?
    }
}

class A extends Object {

    @Override
    public String toString() {
        return "A{}";
    }
}
