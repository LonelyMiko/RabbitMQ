package com.programiz.list;
import  java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);

        // add() method with the index parameter
        languages.add(1, "С++");
        System.out.println("Updated ArrayList: " + languages);

        //Access ArrayList Elements
        System.out.println(languages.get(0));
        System.out.println(languages.get(3));

        // change the element of the array list
        languages.set(2,"JavaScript");
        System.out.println(languages.get(2));

        // Remove ArrayList Elements
        languages.remove(2);
        System.out.println(languages);

        //Get size
        System.out.println(languages.size());
    }
}
