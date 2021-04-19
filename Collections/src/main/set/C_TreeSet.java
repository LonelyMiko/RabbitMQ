package main.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Представляет структуру данных в виде дерева, в котором все объекты хранятся в отсортированном виде по возрастанию.
 * TreeSet является наследником класса AbstractSet и реализует интерфейс NavigableSet, и интерфейс SortedSet.
 *
 * Первое основное различие между HashSet и TreeSet - это производительность.
 * HashSet быстрее TreeSet и должен быть предпочтительным выбором, если сортировка элементов не требуется.
 */
public class C_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
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
