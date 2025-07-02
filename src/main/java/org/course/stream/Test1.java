package org.course.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

      /*  for(int i=0; i<list.size(); i++){
            list.set(i, String.valueOf(list.get(i).length()));
        }*/
        System.out.println(list);

        List<Integer> list2 = list.stream().map(a -> a.length()).collect(Collectors.toList());
                                                                            /* .toList()*/
        System.out.println(list.stream().map(a -> a + " " + a.length()).toList());

        System.out.println(list2);

        int[] array = {5,9,3,8,1};
       int[] res = Arrays.stream(array)
               .map(a -> {
                   if (a % 3 == 0){
                       a /= 3;
                   }
                   return a;
               })
               .toArray();
        System.out.println(Arrays.toString(res));
        System.out.println("------------------------------------------------------------------------------\n" +
                "Работа с Set");

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("ok");
        set.add("poka");
        System.out.println(set);
        Set<Integer> listFromSet = set.stream()
                .map(a -> a.length())
                .collect(Collectors.toSet());
        System.out.println(listFromSet);
    }
}
