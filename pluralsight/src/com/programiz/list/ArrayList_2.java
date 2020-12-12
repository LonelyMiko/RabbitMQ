package com.programiz.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        /* Adding new elements to ArrayList */
        names.add("Persona 5 Royal");
        names.add("THE LAST OF US PART II");
        names.add("Hades");
        names.add("HALF-LIFE:ALYX");
        names.add("Ori and the Will of the Wisps");
        names.add("Demon's Souls");
        names.add("CYBERPUNK 2077");
        names.add("Hades");
        names.add("TEST");

        /* UPDATE ArrayList */
        names.set(7,"Microsoft Flight Simulator");

        /*DELETE item from ArrayList */
        names.remove(8);


//        System.out.println(names);
//        for (String name : names)
//        {
//            System.out.println("Name: " + name);
//        }
        Iterator it = names.iterator();
        while (it.hasNext())
        {
            System.out.println("Name: " + it.next());
        }
    }
}
