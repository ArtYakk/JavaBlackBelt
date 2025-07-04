package org.course.collection.list_interface;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        /*System.out.println(stack.pop()); EmptyStackException
        System.out.println(stack);         нельзя вызывать метод pop() на пустой стек  */

        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println(stack);

       /* while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack);*/
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
