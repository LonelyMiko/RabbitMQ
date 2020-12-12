package com.programiz.list;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();

        for (int i = 0; i < 11; i++) {
            integers.add(i);
        }

        System.out.println(integers);
    }
}
