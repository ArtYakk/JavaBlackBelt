package org.course.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "normalno", "poka");
        for (String s: list){
            System.out.println(s);
        }
        list.forEach(a -> System.out.println(a));
        list.forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(14);
        list2.add(83);
        list2.add(26);
        list2.add(4325);
        list2.add(34);
        list2.add(9);
        list2.add(33);
        list2.add(215);
        list2.forEach(a -> {
            System.out.print(a + " ");
            a = a*2;
            System.out.println(a);
        });

    }
}
