package org.course.collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        //set.add(null);

        System.out.println(set);
        set.forEach(System.out::println);

        set.remove("Zaur");
        System.out.println(set);
        System.out.println(set.contains("Marina"));
        

    }
}
