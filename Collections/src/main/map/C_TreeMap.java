package main.map;
/**
 * Класс TreeMap расширяет класс AbstractMap и реализует интерфейс NavigatebleMap.
 * Он создает коллекцию, которая для хранения элементов применяет дерево.
 * Объекты сохраняются в отсортированном порядке по возрастанию.
 * Время доступа и извлечения элементов достаточно мало, что делает класс TreeMap блестящим выбором для
 * хранения больших объемов отсортированной информации, которая должна быть быстро найдена.
 */

import java.util.TreeMap;

public class C_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> names = new TreeMap<>();
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
