package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultitheading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int drinkerId = 1; drinkerId <= 5; drinkerId++) {
            Runnable runnable = new Drinker(drinkerId);
            Thread thread = new Thread(runnable);
            thread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
