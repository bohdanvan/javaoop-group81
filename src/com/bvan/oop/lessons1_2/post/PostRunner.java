package com.bvan.oop.lessons1_2.post;

/**
 * @author bvanchuhov
 */
public class PostRunner {

    public static void main(String[] args) {
        Post p1 = new Post("@elonmusk", "Tesla Superchargers", 25);
        Post p2 = new Post("@realDonaldTrump", "Great discussions");

        p1.like();
        p1.like();
        p1.like();
        p1.like();

        System.out.println(p1.show());
        System.out.println(p2.show());

        String author = p2.getAuthor();
        System.out.println(author);

        p2.setLikes(100);
        System.out.println(p2.show());
    }
}
