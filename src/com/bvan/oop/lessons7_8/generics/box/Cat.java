package com.bvan.oop.lessons7_8.generics.box;

public class Cat {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        this("Garfild");
    }

    public void meow() {
        System.out.println("Meow-meow " + name);
    }

    public String getName() {
        return name;
    }
}
