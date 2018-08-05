package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class CurrentThreadExample {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("1: " + thread.getName());

        for (int i = 0; i < 10; i++) {
            int x = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    System.out.println(x + ": " + thread.getName());
                }
            }).start();
        }

    }
}
