package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class Inheritance {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Ivan", 25);

        p1.sayHello(); // Hello, I'm unnamed
        p2.sayHello(); // Hello, I'm Ivan

        Developer dev1 = new Developer("Masha", 30, "Amazon");
        dev1.sayHello(); // Hello, I'm dev from Amazon
        dev1.writeCode(); // I write code in Amazon

        Person p3 = new Developer("Anton", 28, "Google");
        p3.sayHello(); // Hello, I'm dev from Google
    }
}

class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("unnamed", 0);
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    protected String getName() {
        return name;
    }
}

class Developer extends Person {

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
        System.out.println("I write code in " + company);
    }
}
