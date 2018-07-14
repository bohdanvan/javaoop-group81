package com.bvan.oop.lessons7_8.generics.pair;

import com.bvan.oop.lessons1_2.post.Post;
import com.bvan.oop.lessons5_6.format.oop.CsvFormatter;
import com.bvan.oop.lessons5_6.format.oop.NameFormatter;

/**
 * @author bvanchuhov
 */
public class PairRunner {

    public static void main(String[] args) {
        Pair<String, Integer> nameAndAge =
                new Pair<>("Vanya", 30);
        System.out.println(nameAndAge);

        Pair<Post, Double> x;
        Pair<String, Long> y;
        Pair<Integer, Integer> z;
    }
}
