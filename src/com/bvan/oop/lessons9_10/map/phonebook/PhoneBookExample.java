package com.bvan.oop.lessons9_10.map.phonebook;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class PhoneBookExample {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new TreeMap<>();

        // HashMap - random ( O(1) )
        // LinkedHashMap - original order ( O(1) )
        // TreeMap - sorted order ( O(logN) )

        phoneBook.put("Vanya", new PhoneNumber("+380951111112"));
        phoneBook.put("Anton", new PhoneNumber("+380951111114"));
        phoneBook.put("Ivan", new PhoneNumber("+380951111111"));
        phoneBook.put("Masha", new PhoneNumber("+380951111113"));

//        phoneBook.put("Ivan", new PhoneNumber("+380951111115"));

        PhoneNumber phoneNumber = phoneBook.get("Ivan");
        System.out.println(phoneNumber);

        Set<String> keys = phoneBook.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println();

        Collection<PhoneNumber> values = phoneBook.values();
        for (PhoneNumber value : values) {
            System.out.println(value);
        }
        System.out.println();

        Set<Map.Entry<String, PhoneNumber>> entries = phoneBook.entrySet();
        for (Map.Entry<String, PhoneNumber> entry : entries) {
            String name = entry.getKey();
            PhoneNumber number = entry.getValue();
            System.out.println(name + " -> " + number);
        }

        // -------
        phoneBook.containsKey("Ivan"); // O(1)
        phoneBook.containsValue(new PhoneNumber("asfasfdasf")); // O(N)
    }
}

class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                '}';
    }
}
