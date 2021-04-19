package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.TreeMap;

public class ParserCSV {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Collections\\src\\resources\\moscow-buildings.csv");
            int length = fileInputStream.available(); // длина всего файла
            byte [] data = new byte[length];
            ArrayList<String[]> lineWords = new ArrayList<>();
            TreeMap <String, Integer> map = new TreeMap<>();
            fileInputStream.read(data);
            String text = new String(data);
            String[] lines = text.split("\n");
            for (String line : lines)
            {
                String[] words = line.split(",");
                lineWords.add(words);
            }
            for (String[] words : lineWords)
            {
                if (map.containsKey(words[9]))
                {
                    Integer k = map.get(words[9]);
                    ++k;
                    map.put(words[9],k);
                }
                else
                    {
                        map.put(words[9],1);
                    }
            }
            for (String key : map.keySet())
            {
                System.out.println("Year: " + key + " " + " Number of buildings: " + map.get(key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
