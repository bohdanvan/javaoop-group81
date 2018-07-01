package com.bvan.oop.lessons5_6.enum_example;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final int releaseYear;
    private final List<Genre> genre;

    public Movie(String title, int releaseYear, List<Genre> genres) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre=" + genre +
                '}';
    }
}
