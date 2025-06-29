package org.course.collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Misha");

        /* arrayList1.add(9, "Misha");
        * IndexOutOfBoundsException
        * Размер массива = 4
        * */

        for(String s : arrayList1){
            System.out.print(s + " ");
        }

        System.out.println();

        /*ArrayList<int> arrayList2 = new ArrayList<>();
        * Нельзя юзать примитивы, у каждого примитива есть
        * wrapper-класс, чтобы переменная была ссылочного типа
        * */

        System.out.print("Метод get: ");
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();

        System.out.println(arrayList1.get(1));

        arrayList1.set(1, "MASHA");
        System.out.println(arrayList1);

        arrayList1.remove(1);
        System.out.println(arrayList1);

        try {
            arrayList1.remove(10);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }




    }
}
