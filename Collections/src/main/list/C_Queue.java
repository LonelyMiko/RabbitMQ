package main.list;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * FIFO(First In First Out)
 *
 * It is an ordered list of objects with its use limited to insert elements at the end of the list
 * and deleting elements from the start of the list, (i.e.),
 * it follows the FIFO or the First-In-First-Out principle.
 */
public class C_Queue {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();
        //Adding Elements
        //add(Object):
        names.add("Prince of Persia");
        names.add("Grand Theft Auto San Andreas");
        names.add("Portal");
        names.add("Portal 2");
        names.add("Limbo");
        names.add("Alan Wake");
        names.add("Assassin's Creed: Brotherhood");
        names.add("Assassin's Creed: Revelations");

        //Read ArrayList
        System.out.println("---------------------------------------");
        System.out.println(names);
        System.out.println("Current size: " + names.size());
        System.out.println("---------------------------------------");

        //Changing Elements
        System.out.println("Updated: " + names);
        System.out.println("---------------------------------------");

        //Removing Elements
        names.remove();
        names.remove("Alan Wake");
        System.out.println("Deleted: " + names);
        System.out.println("Current size: " + names.size());
        System.out.println("---------------------------------------");

        //Iterating the ArrayList
        //for each
        for (String name : names)
        {
            System.out.println(name);
        }

        System.out.println("---------------------------------------");
        //Delete all items from ArrayList
        names.clear();
    }
}
