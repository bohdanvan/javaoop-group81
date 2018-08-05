package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadCreationWithRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}
