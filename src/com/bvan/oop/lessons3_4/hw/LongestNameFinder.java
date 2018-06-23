package com.bvan.oop.lessons3_4.hw;

import java.util.ArrayList;

public class LongestNameFinder {
    public static void main(String[] args) {
//        System.out.println("Hello".charAt(10)); // client


        ArrayList<String> name = new ArrayList<>();
        longestName(name); // client
    }

    private static String longestName(ArrayList<String> names) {
        if (names.isEmpty()){
            throw new IllegalArgumentException("the list is Empty!");
        }
        String longName = "";
        for (String element : names) {
            if (longName.length() < element.length())
                longName = element;
        }
        return longName;
    }
}

//=> Richard
