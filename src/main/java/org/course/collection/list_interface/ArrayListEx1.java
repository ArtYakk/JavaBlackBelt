package org.course.collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList/*<String>*/ arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Dima");
        arrayList1.add(2);
        arrayList1.add(new Car());

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(30);
        for (int i=0; i<30; i++){
            arrayList2.add("Item " + i);
        }
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>();

        List<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);

        System.out.println(arrayList1 == arrayList4);
    }
}

class Car{}