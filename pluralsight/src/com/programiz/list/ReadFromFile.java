package com.programiz.list;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\pluralsight\\src\\com\\resources\\moscow-buildings.csv");
            int length = fileInputStream.available(); // длина файла
            byte [] data = new byte[length];
            fileInputStream.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            ArrayList<String[]> lineWords = new ArrayList<>();
            TreeMap<String, Integer> map = new TreeMap<>();
            for (String line : lines) {
//                System.out.println(line);
//                System.out.println("----------------------------------------------");
                String[] words = line.split(",");
                lineWords.add(words);
            }
                for (String[] words : lineWords) {
                        /** this map will contain the year and the number of houses
                         * @param String -> year
                         * @param Integer - > number of houses
                         */
                        if(map.containsKey(words[9]))
                        {
                            Integer k = map.get(words[9]);
                            // K -> How many houses do we already have on the map
                            k+=1;
                            map.put(words[9], k);
                        }
                        else
                            {
                                map.put(words[9],1);
                            }
                    }
//            System.out.println(map.get("1980"));
            for(String key : map.keySet())
            {
                System.out.println("Year: " + key + " Amount: " + map.get(key));
            }
            }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
