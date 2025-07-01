package org.course.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

        for(int i=0; i<list.size(); i++){
            list.set(i, String.valueOf(list.get(i).length()));
        }
        System.out.println(list);

        System.out.println(list.stream().map(a -> a + " " + a.length()).toList());


    }
}
