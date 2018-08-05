package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithoutMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int drinkerId = 1; drinkerId <= 5; drinkerId++) {
            Drinker drinker = new Drinker(drinkerId);
            drinker.run();
        }

        ThreadUtils.println("Bar is closed");
    }
}

