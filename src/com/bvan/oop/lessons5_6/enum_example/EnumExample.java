package com.bvan.oop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class EnumExample {

    public static void main(String[] args) {
        Genre genre = Genre.CRIME;

        // enum -> String
        String name = genre.name();
        System.out.println(name);

        // enum -> int
        int ordinal = genre.ordinal();
        System.out.println(ordinal);

        // String -> enum
        Genre g2 = Genre.valueOf("DRAMA");
        System.out.println(g2);

        // int -> enum
        Genre[] genres = Genre.values();
        Genre g3 = genres[2];
        System.out.println(g3);

        System.out.println(Genre.COMEDY.shortName());
        System.out.println(Genre.ACTION.shortName());

        System.out.println(Genre.COMEDY.getDescription());
    }
}
