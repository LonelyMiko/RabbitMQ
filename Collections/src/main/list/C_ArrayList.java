package main.list;
import java.util.ArrayList;

public class C_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
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
