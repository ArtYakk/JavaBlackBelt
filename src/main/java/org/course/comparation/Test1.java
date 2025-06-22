package org.course.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Artem");
        list.add("Ivan");

        System.out.println("Pre sort");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("Post sort");
        System.out.println(list);


    }
}
