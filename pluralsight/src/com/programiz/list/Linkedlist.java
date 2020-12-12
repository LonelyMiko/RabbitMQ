package com.programiz.list;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names= new LinkedList<>();
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

        for (String name : names) {
            System.out.println(name);
        }
    }
}
