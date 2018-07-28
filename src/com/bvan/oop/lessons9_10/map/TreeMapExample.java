package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.lessons5_6.format.Product;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class TreeMapExample {

    public static void main(String[] args) {
        NavigableMap<Long, Product> priceToProduct = new TreeMap<>();

        priceToProduct.put(2000L, new Product("MacBook", 2000L));
        priceToProduct.put(1500L, new Product("Lenovo", 1500L));
        priceToProduct.put(1700L, new Product("Asus", 1700L));

        System.out.println(priceToProduct.lastEntry());
        System.out.println(priceToProduct.firstEntry());

        SortedMap<Long, Product> subMap = priceToProduct.subMap(1000L, 1800L);
        System.out.println(subMap.values());
    }
}
