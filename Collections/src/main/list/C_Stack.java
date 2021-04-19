package main.list;

import java.util.Stack;

/**
 * Last-In-First-Out(LIFO)
 *
 * Please note that the Stack class in Java is a legacy class and inherits from Vector in Java.
 * It is a thread-safe class and hence involves overhead when we do not need thread safety.
 * It is recommended to use ArrayDeque for stack implementation
 * as it is more efficient in a single-threaded environment.
 */
public class C_Stack {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        //Adding Elements
        //push()
        names.push("Prince of Persia");
        names.push("Grand Theft Auto San Andreas");
        names.push("Portal");
        names.push("Portal 2");
        names.push("Limbo");
        names.push("Alan Wake");
        names.push("Assassin's Creed: Brotherhood");

        //Accessing the Element
        //peek
        System.out.println("The element at the top of the stack is: " + names.peek());
        System.out.println("---------------------------------------");

        //Removing Elements
        //pop()
        System.out.println("Before pop(): " + names);
        System.out.println("---------------------------------------");
        System.out.println(names.pop() + " was removed");
        System.out.println("---------------------------------------");
        System.out.println("After pop(): " + names);
        System.out.println("---------------------------------------");
        /**
         * It determines whether an object exists in the stack. If the element is found
         * it returns the position of the element from the top of the stack. Else, it returns -1.
         */
        System.out.println(names.search("Limbo"));
    }
}
