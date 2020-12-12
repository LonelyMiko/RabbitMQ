package com.programiz.list;

import java.util.HashSet;
import java.util.TreeSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Persona 5 Royal");
        names.add("THE LAST OF US PART II");
        names.add("Hades");
        names.add("HALF-LIFE:ALYX");
        names.add("Ori and the Will of the Wisps");
        names.add("Demon's Souls");
        names.add("CYBERPUNK 2077");
        names.add("Hades");
        names.add("TEST");
        names.add("TEST");

        names.remove("Hades");
        names.contains("CYBERPUNK 2077");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 11; ++i)
        {
            numbers.add((int) (Math.random()*(10-0)+1) +1);
        }
        for (int number : numbers)
        {
            System.out.println(number);
        }

    }
}
