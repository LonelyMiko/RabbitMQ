package com.programiz.list;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        //O(1)
//        HashMap<String, Integer> student = new HashMap<>();
//        for (int i = 0; i < 6; i++)
//        {
//            student.put("Elementul "+i, i);
//        }
//        for (Map.Entry<String, Integer> object : student.entrySet())
//        {
//            System.out.println(object.getKey() + " : " + object.getValue());
//        }

        // O(log N)
        TreeMap<String, Integer> student_2 = new TreeMap<>();
        for (int i = 0; i < 6; i++)
        {
            student_2.put("Elementul "+i, i);
        }
        //student_2.remove("Elementul 0");
        for (Map.Entry<String, Integer> object : student_2.entrySet())
        {
            System.out.println(object.getKey() + " : " + object.getValue());
        }
        student_2.put("Elementul 5", 50);
    }
}