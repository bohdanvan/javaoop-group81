package com.bvan.oop.lessons3_4.dish;

/**
 * @author bvanchuhov
 */
public class DishRunner {

    public static void main(String[] args) {
        Dish ovivie = new Dish("Olivie", ".....", 200);
        Dish chicken = new Dish("Chicken", "....", 150);

        Menu summerMenu = new Menu("summerMenu");
        summerMenu.addDish(ovivie);
        summerMenu.addDish(chicken);

        Dish cheapestDish = summerMenu.getCheapestDish();
        System.out.println("cheapestDish = " + cheapestDish);

        System.out.println();
    }
}
