package com.bvan.oop.lessons1_2.storing;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class ImmutableObject {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // 2018

        LocalDate d2 = date.minusYears(100); // 1918

        System.out.println(date);
        System.out.println(d2);

        LocalDate d3 = d2.minusYears(1000);
    }
}
