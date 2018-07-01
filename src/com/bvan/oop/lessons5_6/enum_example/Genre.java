package com.bvan.oop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public enum Genre {
    ACTION("....."),
    COMEDY("Funny movie"),
    DRAMA("...."),
    THRILLER("....."),
    CRIME("......");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String shortName() {
        return name().substring(0, 3);
    }

    public String getDescription() {
        return description;
    }
}
