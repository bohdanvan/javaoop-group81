package com.bvan.oop.lessons11_12.java8;

import com.bvan.oop.lessons5_6.format.Product;
import com.bvan.oop.lessons5_6.format.oop.Formatter;

/**
 * @author bvanchuhov
 */
public class FormatterLambda {

    public static void main(String[] args) {
        Formatter formatter = new Formatter() {
            @Override
            public String format(Product product) {
                return product.getName();
            }
        };

        Formatter formatter2 = p -> p.getName();
        String s = formatter2.format(new Product("MacBook", 2000));
        System.out.println(s);

        Formatter formatter3 = Product::getName;
        Formatter formatter4 = FormatterLambda::csv;

        JsonFormatter jsonFormatter = new JsonFormatter();
        Formatter formatter5 = p -> jsonFormatter.json(p);
    }

    private static String csv(Product p) {
        return p.getName() + p.getPrice();
    }
}

class JsonFormatter {
    public String json(Product p) {
        return "...";
    }
}
