package org.course.collection.list_interface;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Ivan", 3);
        Student2 student2 = new Student2("Nikolay", 2);
        Student2 student3 = new Student2("Elena", 1);
        Student2 student4 = new Student2("Petr", 4);
        Student2 student5 = new Student2("Mariya", 3);

        LinkedList<Student2> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);

        System.out.println("LinkedList = " + linkedList);

        System.out.println(linkedList.get(2));

        Student2 student6 = new Student2("Zaur", 4);
        Student2 student7 = new Student2("Igor", 3);
        linkedList.add(student6);
        linkedList.add(student7);
        System.out.println("LinkedList = " + linkedList);

        Student2 student8 = new Student2("Ururu", 4);
        linkedList.add(1, student8);
        System.out.println("LinkedList = " + linkedList);

        linkedList.remove(1);
        System.out.println("LinkedList = " + linkedList);
    }

}

class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
