package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithRunnableLambda {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> ThreadUtils.println("Hello"));
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

