package com.bvan.oop.lessons7_8.generics;

import com.bvan.oop.lessons1_2.post.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithGenericsExample { // Java 5

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Vasya");
        names.add(10);
        names.add(new Post("A", "B", 1));

        String o = (String) names.get(0);

        System.out.println(names);
    }
}
