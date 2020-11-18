package com.serialization;
import java.io.*;

/**
 * Class for object deserialization
 */

public class deserialize_method {
    /**
     * The constructor of this class accepts two parameters and returns object deserialization,
     * if object deserialization cannot be realized, then returns IOException or ClassNotFoundException.
     * @param obj
     * @param name
     * @see ObjectInputStream
     */
    public deserialize_method(Book obj, String name) {
        Book book = null;
        try {
            FileInputStream fileIn = new FileInputStream(name + ".ser"); // Открыть сериализованный  файл
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            book = (Book) objectIn.readObject();
            objectIn.close(); // закрываем ObjectInputStream
            fileIn.close(); // закрываем FileInputStream
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден :c ");
            e.printStackTrace();
            return;
        }
        System.out.println("Десериализованный " + name);
        System.out.println(book.toString());
    }
}
