package org.course.collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student4 student1 = new Student4("Zaur", 5);
        Student4 student2 = new Student4("Misha", 1);
        Student4 student3 = new Student4("Egor", 2);
        Student4 student4 = new Student4("Marina", 3);
        Student4 student5 = new Student4("Olya", 4);
        PriorityQueue<Student4> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);

        /* При выводе на экран у PriorityQueue нет никакой сортировки,
        даже несмотря на то, что мы реализовали Comparable
        Натуральный порядок будет использоваться ПРИ РАБОТЕ с этой очередью
        * */
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}

class Student4 implements Comparable<Student4>{
    String name;
    int course;

    public Student4(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student4 o) {
        return course - o.course;
    }

    @Override
    public String toString() {
        return "Student4{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student4 student4 = (Student4) o;
        return course == student4.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
