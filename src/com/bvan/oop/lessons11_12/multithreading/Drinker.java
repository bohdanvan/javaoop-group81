package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private final int id;

    Drinker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int beer = 1; ; beer++) {
            if (Thread.currentThread().isInterrupted()) {
                lastAction();
                return;
            }
            ThreadUtils.println("I'm " + id + " drinker. " +
                    "I'm drinking " + beer + " beer");

            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                lastAction();
                return;
            }
        }
    }

    private void lastAction() {
        ThreadUtils.println("Hasta la vista");
    }
}
