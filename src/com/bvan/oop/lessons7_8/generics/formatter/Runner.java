package com.bvan.oop.lessons7_8.generics.formatter;

import com.bvan.oop.lessons7_8.generics.box.Cat;
import com.bvan.oop.lessons7_8.generics.box.Dog;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Printer<Cat> catPrinter = new Printer<>();
        catPrinter.add(new Cat("Vasya"));
        catPrinter.add(new Cat("Murchick"));

        Formatter<Cat> formatter = new CatFormatter();
        catPrinter.print(formatter);

        // -----

        Printer<Dog> dogPrinter = new Printer<Dog>();
        dogPrinter.add(new Dog());
        dogPrinter.add(new Dog());
        dogPrinter.print(new Formatter<Dog>() {
            @Override
            public String format(Dog value) {
                return "Dog....";
            }
        });
    }
}

class CatFormatter implements Formatter<Cat> {

    @Override
    public String format(Cat value) {
        return "Meow " + value.getName();
    }
}
