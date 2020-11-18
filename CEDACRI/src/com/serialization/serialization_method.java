package com.serialization;

import java.io.*;
/**
 * Class for object serialization
 */
public class serialization_method {
    /**
     * The constructor of this class accepts two parameters and returns serialization of the object,
     * if serialization of the object cannot be realized, then returns IOException.
     * @param obj
     * @param name
     * @see ObjectOutputStream
     */
    public serialization_method(Book obj, String name) {
        try {
            FileOutputStream fileOut = new FileOutputStream(name + ".ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            objectOut.close();
            fileOut.close();
            System.out.println("Сериализация прошла успешна, новый файл: " + name + ".ser");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

