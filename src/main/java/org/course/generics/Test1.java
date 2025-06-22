package org.course.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /*
        Без дженериков разработчикам языка пришлось бы писать реализацию
        List для каждого типа данных, благодаря им лист написан в общем виде
        Reusable code - best practise
        */

//        list.add("OOK");
//        list.add(4);
//        list.add(new StringBuilder("BUILDER"));
//        list.add(new Car());

        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("something");
//        list.add(new Car()); // Компилятор заругается, лучше обеспечить выявление ошибок
                               // на этапе компиляции

        list.forEach(System.out::println);

        for(Object o : list){
            System.out.println(o + " dlina " + ((String)o).length());
        }


    }
}

class Car{}
