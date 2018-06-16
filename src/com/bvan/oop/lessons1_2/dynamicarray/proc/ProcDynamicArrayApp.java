package com.bvan.oop.lessons1_2.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayApp {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();
        Arrays.sort(elems);
        System.out.println(Arrays.toString(elems));
    }

    public static int[] readClientElemsFromConsole() {
        Scanner scan = new Scanner(System.in);

        int size = 0;
        int[] elems = new int[4];

        int n = readClientElem(scan);
        while (n != 0) {
            if (size == elems.length) {
                int newLength = (int)(1.5 * elems.length);
                elems = Arrays.copyOf(elems, newLength);
            }
            elems[size] = n;
            size++;

            n = readClientElem(scan);
        }
        return Arrays.copyOf(elems, size);
    }

    public static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length + 1);
        newElems[newElems.length - 1] = n;
        elems = newElems;
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
