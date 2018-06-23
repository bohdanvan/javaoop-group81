package com.bvan.oop.lessons3_4.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class NamesCapLetter {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Phil", "Anny", "Aaron", "Bob"));

        System.out.println(namesWithStartLetter(names, 'A'));
    }

    public static ArrayList<String> namesWithStartLetter(
            ArrayList<String> names, char startLetter) {

        if (!Character.isAlphabetic(startLetter)) {
            throw new IllegalArgumentException("start letter is not alphabetic: " + startLetter);
        }

        ArrayList<String> namesWithCapLetter = new ArrayList<>();
        for (String name : names) {
            if (startLetter == name.charAt(0))
                namesWithCapLetter.add(name);
        }
        return namesWithCapLetter;
    }
}
