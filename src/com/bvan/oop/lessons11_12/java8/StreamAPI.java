package com.bvan.oop.lessons11_12.java8;

import com.bvan.oop.lessons5_6.format.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author bvanchuhov
 */
public class StreamAPI {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));
        products.add(new Product("Asus", 1700));
        products.add(new Product("Aser", 1700));

        // imperative
        List<String> names = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 1800 && product.getName().startsWith("A")) {
                String name = product.getName();
                names.add(name);
            }
        }
        System.out.println();

        // declarative
        List<String> shortNames = products.stream()
                .filter(p -> p.getPrice() < 1800)
                .filter(p -> p.getName().startsWith("A"))
                .map(product -> product.getName())
                .map(n -> n.substring(0, 2))
                .distinct()
                .collect(Collectors.toList());
        //.forEach(p -> System.out.println(p));

        System.out.println(shortNames);

        // -------

        for (String shortName : shortNames) {
            System.out.println(shortName);
        }

        shortNames.forEach(System.out::println);
    }
}
