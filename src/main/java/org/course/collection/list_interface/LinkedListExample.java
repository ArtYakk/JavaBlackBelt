package org.course.collection.list_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        /* offer() это как add(), только если
        очередь ограниченная и мы попытаемся добавить таким
        способом, то вылетит Exception
        * */
        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mariya");
        queue.offer("Aleksandr");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        /* С помощью remove() можно удалить хоть с середины
        очереди, однако смысла в этом нет, для таких кейсов
        лучше применить другую коллекцию
        * */
        System.out.println(queue.remove("Ivan"));
        System.out.println(queue);
        queue.offer("Ivan"); // Верну назад

        /* poll() это как remove(), удаляет первый в FIFO очереди
        элемент, но в случае применения этого метода мы получим null(),
        тогда как с remove() вылетел бы Exception
        * */
        /* метод element() нужен чтобы просто посмотреть в начало очереди,
        однако если очередь пуста, вылетит NoSuchElementException
        * */
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        /*System.out.println(queue.element()); NoSuchElementException */
        System.out.println(queue.peek()); // Ошибки нет, мы просто видим что список пуст, null на выходе
        System.out.println(queue.poll());
        /*System.out.println(queue.remove());*/
    }
}
