package com.bvan.oop.lessons3_4;

import com.bvan.oop.lessons1_2.post.Post;

/**
 * @author bvanchuhov
 */
public class StaticMethod {

    public static void main(String[] args) {
        Post post = new Post("@elonmusk", "Tesla Superchargers", 25);
        String postInfo = post.show();
        System.out.println(postInfo);

        int min = Math.min(10, 20);
        System.out.println(min);

        double pi = Math.PI;
    }
}
