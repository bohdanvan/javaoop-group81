package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        cart.print(csvFormatter());
        System.out.println();

        Formatter formatter = toStringFormatter();
        cart.print(formatter);
    }

    public static Formatter csvFormatter() {
        return new CsvFormatter();
    }

    public static Formatter toStringFormatter() {
        // anonymous class
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }

    public static Formatter toStringFormatterLambda() {
        // lambda
        return product -> product.toString();
    }

    public static void advanced(Cart cart) {
        List<Formatter> formatters = Arrays.asList(
                new CsvFormatter(),
                new NameFormatter()
        );

        Formatter formatter = new CompositeFormatter(formatters);
        cart.print(formatter);
    }
}
