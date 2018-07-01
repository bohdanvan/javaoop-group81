package com.bvan.oop.lessons5_6.abstractclass;

/**
 * @author bvanchuhov
 */
public class AbstractClassExample {

    public static void main(String[] args) {
//        Person p = new Person();
        Developer dev = new Developer("Vasya", 50, "IBM");
        Person p = new Developer("Petya", 40, "xxxx");
    }
}

abstract class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("unnamed", 0);
    }

    public abstract void sayHello();

    protected final String getName() {
        return name;
    }
}

final class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public Developer(String company) {
        this.company = company;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm dev " + getName() + " from " + company);
    }

    public void writeCode() {

    }
}
