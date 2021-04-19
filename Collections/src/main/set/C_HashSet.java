package main.set;
/**
 * Хеш-таблица представляет такую структуру данных, в которой все объекты имеют уникальный ключ или хеш-код.
 * Данный ключ позволяет уникально идентифицировать объект в таблице.
 */

import java.util.HashSet;
import java.util.Iterator;

public class C_HashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        //Adding Elements
        //add(Object):
        names.add("Prince of Persia");
        names.add("Grand Theft Auto San Andreas");
        names.add("Portal");
        names.add("Portal 2");
        names.add("Limbo");
        names.add("Alan Wake");
        names.add("Alan Wake");
        names.add("Alan Wake");
        names.add("Alan Wake");
        names.add("Alan Wake");
        names.add("Assassin's Creed: Brotherhood");

        //Read ArrayList
        System.out.println("---------------------------------------");
        System.out.println(names);
        System.out.println("Current size: " + names.size());
        System.out.println("---------------------------------------");

        //Changing Elements
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
//        for (String name : names)
//        {
//            System.out.println(name + " " + name.hashCode());
//        }

        // Iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------------------");
        //Delete all items from ArrayList
        names.clear();
    }
}
