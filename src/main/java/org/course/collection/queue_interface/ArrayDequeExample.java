package org.course.collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(3);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(5);
        System.out.println(arrayDeque);
        arrayDeque.addLast(7);
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(1);
        System.out.println(arrayDeque);
        arrayDeque.offerLast(8);
        System.out.println(arrayDeque); // 1 5 3 7 8

        System.out.println("Первый элемент: " + arrayDeque.getFirst());
        System.out.println("Последний элемент: " + arrayDeque.getLast());

        System.out.println("Забираем, удаляем");
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());

        System.out.println(arrayDeque.removeFirst()); // 1
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.removeLast()); // 8
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pollFirst()); // 5
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pollLast()); // 7
        System.out.println(arrayDeque);
    }
}
