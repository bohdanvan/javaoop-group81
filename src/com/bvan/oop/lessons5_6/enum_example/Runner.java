package com.bvan.oop.lessons5_6.enum_example;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Movie movie = new Movie(
                "Pulp Fiction",
                1994,
                Arrays.asList(Genre.CRIME, Genre.COMEDY, Genre.THRILLER)
        );
        System.out.println(movie);
    }
}
