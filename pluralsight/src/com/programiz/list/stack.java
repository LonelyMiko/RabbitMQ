package com.programiz.list;
import java.util.Stack;
//The Stack class extends the Vector class.
public class stack {
    public static void main(String[] args) {
        // Stack = LIFO (Last Input First Output)
        Stack<String> animals= new Stack<>();

        // Add an element to the top of the stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        //Remove an element from the top of the stack
//        String deleted = animals.pop();
//        System.out.println(deleted);
        System.out.println(animals.pop());

        //Returns an object from the top of the stack
        System.out.println(animals.peek());

        //Search an element in the stack
        System.out.println(animals.search("Horse"));
    }

}
