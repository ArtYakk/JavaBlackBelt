package org.course.collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(2154, "Nikolay Petrov");
        System.out.println(map1);

        System.out.println("putIfAbsent() - 1000 - Zaur Tregulov");
        map1.putIfAbsent(1000, "Zaur Kvadratov");
        System.out.println(map1);

        map1.put(null, "Sergey Petrov");
        map1.put(1234, null);
        System.out.println(map1);

        System.out.println("remove() 6578 - Mariya Sidorova");
        map1.remove(6578);
        System.out.println(map1);

        System.out.println("containsValue() Ivan Ivanov");
        System.out.println(map1.containsValue("Ivan Ivanov"));

        System.out.println("containsValue() Mariya Sidorova");
        System.out.println(map1.containsValue("Mariya Sidorova"));

        System.out.println("containsKey() 1000 - Zaur Tregulov");
        System.out.println(map1.containsKey(1000));

        System.out.println("containsKey() 6578 - Mariya Sidorova");
        System.out.println(map1.containsKey(6578));

        System.out.println("keySet()");
        System.out.println(map1.keySet());

        System.out.println("values()");
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Dobriy");
        map2.put("Misha", "Umniy");



    }
}
