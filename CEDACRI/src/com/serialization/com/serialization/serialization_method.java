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
            //create 2 streams to serialize the object and save it to a file
            FileOutputStream fileOut = new FileOutputStream(name + ".ser");

            //ObjectOutputStream writes primitive types into OutputStream as a byte stream.
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            //writeObject(), starts the serialization mechanism and the object decomposes into bytes
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

