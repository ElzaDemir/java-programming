package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //LIFO

        Stack<String> booksStack = new Stack<>();

        booksStack.add("Harry Potter");
        booksStack.add("Leader eat last");
        booksStack.add("Java intro");
        booksStack.push("Cucumber");
        System.out.println(booksStack);

        System.out.println("This is at the top of the stack: " + booksStack.peek());
       // System.out.println(booksStack.remove(0));

       // booksStack.pop(); //removes and returns the top of the stack item
        System.out.println(booksStack.pop());
        System.out.println(booksStack.peek());

        System.out.println("Final version: " + booksStack);

    }
}
