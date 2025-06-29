package org.course.collection.list_interface;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder("A");
        StringBuilder builder2 = new StringBuilder("B");
        StringBuilder builder3 = new StringBuilder("C");
        StringBuilder builder4 = new StringBuilder("D");
        StringBuilder[] array = {builder1, builder2, builder3, builder4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        //array[0].append("!!!");
        array[0] = new StringBuilder("F");
        System.out.println(list);

    }
}
