package com.bvan.oop.lessons7_8.generics.formatter;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {

    String format(T value);
}
