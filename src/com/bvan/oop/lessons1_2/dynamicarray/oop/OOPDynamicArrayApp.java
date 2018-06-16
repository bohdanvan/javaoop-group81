package com.bvan.oop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPDynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();
        System.out.println(elems.toString());
    }

    public static DynamicArray readClientElemsFromConsole() {
        Scanner scan = new Scanner(System.in);

        DynamicArray elems = new DynamicArray();

        int n = readClientElem(scan);
        while (n != 0) {
            elems.addLast(n);

            n = readClientElem(scan);
        }
        return elems;
    }

    public static int readClientElem(Scanner scan) {
        System.out.print(">> ");

        while (!scan.hasNextInt()) {
            scan.next(); // skip

            System.out.println("Illegal number");
            System.out.print(">> ");
        }

        return scan.nextInt();
    }
}
