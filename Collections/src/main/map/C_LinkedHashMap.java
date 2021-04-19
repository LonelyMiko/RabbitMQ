package main.map;
/**
 * Класс LinkedHashMap хранит элементы типа “ключ – значение” в том порядке, в котором они были добавлены.
 * Это означает, что когда мы захотим вывести содержимое структуры данных мы получим их
 * не упорядоченными по возрастанию, а в порядке добавления.
 **/

import java.util.LinkedHashMap;

public class C_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> names = new LinkedHashMap<>();
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

        //Find Elements

        System.out.println(names.containsValue(2007));

        //Removing Elements
        names.remove("Portal");
        names.remove("Portal 2",2011);
        names.clear();
    }
}
