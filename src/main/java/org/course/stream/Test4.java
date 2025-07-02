package org.course.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        Integer x = list.stream()
                .reduce((accumulator, element) -> element*accumulator).get();
        System.out.println(x);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> result100 = list100.stream()
                .reduce((accumulator, element) -> element*accumulator);
        if (result100.isPresent()){
            System.out.println(result100);
        }else {
            System.out.println("Нет значения");
        }

        int result2 = list.stream()
                .reduce(10 , (accumulator, element) -> element*accumulator);
        System.out.println(result2);

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("ok");
        list3.add("poka");
        System.out.println(list3.stream()
                .reduce("Семечко:", (a, e) -> a + " " + e));
    }
}
