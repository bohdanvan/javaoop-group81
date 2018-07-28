package com.bvan.oop.lessons9_10.sorting;

import com.bvan.oop.lessons5_6.format.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class SortingExample {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));
        products.add(new Product("Asus", 1700));
        products.add(new Product("Aser", 1700));


        Comparator<Product> c = new NameComparator();
        products.sort(c);

        System.out.println(products);
    }
}

class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        String nameA = a.getName();
        String nameB = b.getName();
        return nameA.compareTo(nameB);
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return Long.compare(a.getPrice(), b.getPrice());
    }
}
