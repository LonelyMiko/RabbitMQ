package com.serialization;
import java.io.*;

public class game_deserialize {

        public static void main(String[] args) throws IOException, ClassNotFoundException {

            FileInputStream fileInputStream = new FileInputStream("save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            game savedGame = (game) objectInputStream.readObject();

            System.out.println(savedGame);
        }
    }
