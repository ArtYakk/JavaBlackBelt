package org.course.collection;


import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Ivan");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Lesha");
        arrayList2.add("Petr");

        arrayList1.addAll(arrayList2);

        System.out.println(arrayList1);

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("!!!");
        arrayList3.add("???");

        arrayList1.addAll(0, arrayList3);

        System.out.println(arrayList1);
        /* System.out.println(arrayList1.toString()); */

        System.out.println(arrayList1.get(arrayList1.indexOf("Ivan")));

        System.out.println(arrayList1.lastIndexOf("Ivan"));

        System.out.println(arrayList1.size());

        System.out.println(arrayList1.isEmpty());

        System.out.println("То чего нет в листе " + arrayList1.contains("sadsa"));
        System.out.println("Иван есть в листе? " + arrayList1.contains("Ivan"));

        /// ///////////////////////////

        arrayList1.clear();

        System.out.println(arrayList1);

        System.out.println(arrayList1.isEmpty());



    }
}
