package org.course.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Objects> list1 = new ArrayList<Integer>();

//        List<?> list1 = new ArrayList<String>();
//        list1.add("sadas");

        // Bounded wildcard // ? = любые наследники Number, либо сам Number
        List<? extends Number> list30 = new ArrayList<Integer>();

        // Bounded wildcard // ? = любые родители Number, либо сам Number
        List<? super Number> list40 = new ArrayList<Number>();


        List<Double> doubleList = new ArrayList<>(List.of(2.2,2.1,3.5,4.3,5.9,6.5,8.43,9.23));
        showListInfo(doubleList);

        List<String> stringList = new ArrayList<>(List.of("one", "two", "three", "four", "five"));
        showListInfo(stringList);

        System.out.println(sum(new ArrayList<>(List.of(2.2,2.1,3.5,4.3,5.9,6.5,8.43,9.23))));
        System.out.println(sum(new ArrayList<>(List.of(1,2,3,4,5,6,7,8))));
        System.out.println(sum(new ArrayList<>(List.of(1f,2f,3f,4f,5f,6f,7f,8f, 9f))));
    }

    static void showListInfo(List<?> list){
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

    public static double sum(ArrayList<? extends Number> list){
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
}


