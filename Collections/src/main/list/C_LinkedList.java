package main.list;
/**
 * This class is a linear data structure where
 * the elements are not stored in contiguous locations and
 * every element is a separate object with a data part and address part.
 * The elements are linked using pointers and addresses. Each element is known as a node.
 * Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays.
 * It also has few disadvantages like the nodes cannot be accessed directly instead
 * we need to start from the head and follow through the link to reach to a node we wish to access.
 */

import java.util.LinkedList;

public class C_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        //Adding Elements
        //add(Object):
        names.add("Prince of Persia");
        names.add("Grand Theft Auto San Andreas");
        names.add("Portal");
        names.add("Portal 2");
        names.add("Limbo");
        names.add("Alan Wake");
        names.add("Assassin's Creed: Brotherhood");
        //add(int index, Object):
        names.add(1,"Assassin's Creed: Revelations");

        //Read ArrayList
        System.out.println(names.get(4));
        System.out.println("---------------------------------------");
        System.out.println(names);
        System.out.println("Current size: " + names.size());
        System.out.println("---------------------------------------");

        //Changing Elements
        names.set(2,"Driver: San Francisco");
        System.out.println("Updated: " + names);
        System.out.println("---------------------------------------");

        //Removing Elements
        names.remove(2);
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
