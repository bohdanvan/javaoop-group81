package com.bvan.oop.lessons9_10.map.phonebook;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bvanchuhov
 */
public class PhoneBook {

    private final Map<String, PhoneNumber> phoneBook = new HashMap<>();

    public void addRecord(String name, PhoneNumber number) {
        phoneBook.put(name, number);
    }

    public PhoneNumber find(String name) {
        return phoneBook.get(name);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }
}
