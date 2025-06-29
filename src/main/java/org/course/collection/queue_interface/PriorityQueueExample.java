package org.course.collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        /* Этой коллекции нужно чтобы хранимый тип данных (Класс)
        реализовывал Comparable
        Элементы хранятся по приоритету, отсортированные в натуральном порядке
        Порядок добавления не нужен
        * */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        // 1, 4, 7, 8, 10

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        /*System.out.println(priorityQueue.remove()); NoSuchElementException */
    }
}
