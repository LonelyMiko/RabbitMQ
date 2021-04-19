package main.map;

import java.util.HashMap;

public class C_HashMap {
    public static void main(String[] args) {
        HashMap <String, Integer> names = new HashMap<>();
        //Adding Elements
        //put()
        names.put("Alan Wake", 2010);
        names.put("Prince of Persia",2010);
        names.put("Portal",2007);
        names.put("Portal 2",2011);
        names.put("Alan Wake",-1);
        names.put("Assassin's Creed: Brotherhood",2010);

        //Read HashMap
        System.out.println("Alan Wake: " + names.get("Alan Wake"));
        System.out.println("---------------------------------------");
        System.out.println(names);

        //Removing Elements
        names.remove("Portal");
        names.remove("Portal 2",2011);
        names.clear();
    }
}
