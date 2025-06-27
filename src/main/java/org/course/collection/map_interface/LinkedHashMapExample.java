package org.course.collection.map_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);


        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.4, st2);
        linkedHashMap.put(7.2, st3);
        linkedHashMap.put(7.5, st4);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(6.4));
        System.out.println(linkedHashMap.get(7.2));

        System.out.println(linkedHashMap);


    }
}
