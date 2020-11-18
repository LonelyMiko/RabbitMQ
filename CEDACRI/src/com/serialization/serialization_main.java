package com.serialization;
import java.io.*;
public class serialization_main {
    public static void main(String[] args) {
        Book oneHundredYearsOfSolitude = new Book("One Hundred Years of Solitude",417," Gabriel García Márquez","9780060919658","Novel");
        Book animalFarm = new Book("Animal Farm",112,"George Orwell","9780151002177","Satire");

        System.out.println();
        System.out.println("\t********************************** Печатаем Обьект ********************************** ");
        System.out.println(oneHundredYearsOfSolitude.toString());
        System.out.println(animalFarm.toString());

        System.out.println();
        System.out.println("\t********************************** Сериализация объекта ********************************** ");
        serialization_method oneHundredYearsOfSolitudeSerialization = new serialization_method(oneHundredYearsOfSolitude, "oneHundredYearsOfSolitude");
        serialization_method animalFarmSerialization = new serialization_method(animalFarm, "animalFarm");

        System.out.println();
        System.out.println("\t********************************** Десериализация объекта ********************************** ");
        deserialize_method oneHundredYearsOfSolitudeDerialization = new deserialize_method(oneHundredYearsOfSolitude, "oneHundredYearsOfSolitude");
        deserialize_method animalFarmDerialization = new deserialize_method(animalFarm, "animalFarm");
    }
}
