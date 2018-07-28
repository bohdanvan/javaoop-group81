package com.bvan.oop.lessons9_10.map.wordscounter;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> langs = langs();
        Map<String, Integer> wordToCount = countWords(langs);
        System.out.println(wordToCount);
    }

    public static List<String> langs() {
        return Arrays.asList(
                "JavaScript",
                "Java",
                "Python",
                "Java",
                "Java",
                "Haskell",
                "JavaScript",
                "JavaScript",
                "Ruby",
                "JavaScript",
                "Java",
                "Python",
                "Python",
                "Haskell",
                "Haskell",
                "Java",
                "Java",
                "Haskell",
                "Ruby"
        );
    }

    public static Map<String, Integer> countWords(
            List<String> words) {

        Map<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }
}
