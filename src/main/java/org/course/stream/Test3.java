package org.course.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
        Arrays.stream(array)
                .forEach(a -> {
                    a = a*2;
                    System.out.println(a);
                });
        System.out.println("--------------------------------------------");
        Arrays.stream(array)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------");
        Arrays.stream(array)
                .forEach(Utils::myMethod);


    }
}

class Utils{
    public static void myMethod(int a){
        a = a+5;
        System.out.println("Element = " + a);
    }
}
