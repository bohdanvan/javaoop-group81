package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritancePractice {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.foo(); // A: foo
        b.foo(); // B: foo
        b.foo(10); // B: foo(int)
        System.out.println("-------");

        A a2 = new B();

//        A a3 = new B();
//        a3.foo(10);
    }
}

class A {
    public void foo() {
        System.out.println("A: foo");
    }
}

class B extends A {

    @Override
    public void foo() {
        System.out.println("B: foo");
    }

    public void foo(int a) {
        System.out.println("B: foo(int)");
    }
}
