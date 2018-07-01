package com.bvan.oop.lessons5_6.exception.unchecked.factorial;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        try {
            BigInteger factorial = Factorial.factorial(-1);
            System.out.println(factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime Error: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Goodbye");
    }
}
