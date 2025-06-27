package org.course.collection.map_interface;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        hashtable.put(7.8, st1);
        hashtable.put(9.3, st2);
        hashtable.put(5.8, st3);
        hashtable.put(6.0, st4);

        /* Нельзя вставлять null ни на K ни на V
        hashtable.put(null, st4);
        hashtable.put(6.0, null);*/



    }
}
