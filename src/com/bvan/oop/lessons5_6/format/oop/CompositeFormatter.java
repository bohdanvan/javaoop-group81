package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class CompositeFormatter implements Formatter {

    private final List<Formatter> formatters;

    public CompositeFormatter(List<Formatter> formatters) {
        this.formatters = formatters;
    }

    @Override
    public String format(Product product) {
        String s = "";
        for (Formatter formatter : formatters) {
            s += formatter.format(product) + "\n";
        }
        return s;
    }
}
