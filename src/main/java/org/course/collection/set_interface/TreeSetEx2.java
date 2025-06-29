package org.course.collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student3> treeSet = new TreeSet<>();
        Student3 student1 = new Student3("Zaur", 5);
        Student3 student2 = new Student3("Misha", 1);
        Student3 student3 = new Student3("Igor", 2);
        Student3 student4 = new Student3("Marina", 3);
        Student3 student5 = new Student3("Olya", 4);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student3 student6 = new Student3("Oleg", 3);
        System.out.println(treeSet.headSet(student6));
        System.out.println(treeSet.tailSet(student3));

        Student3 student7 = new Student3("Oleg", 6);
        System.out.println(treeSet.subSet(student6, student7));

        System.out.println(student4.equals(student6));
        System.out.println(student4.hashCode() == student6.hashCode());
    }
}

class Student3 implements Comparable<Student3>{
    String name;
    int course;

    public Student3(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student3 o) {
        return course - o.course;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return course == student3.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
