package org.course.collection.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        System.out.println(arrayList1);

        System.out.println("-------------------массив-объектов-------------------");
        Object[] array = arrayList1.toArray();
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("-------------------массив-объектов-------------------");


        System.out.println("-------------------массив-стрингов-------------------");
        String[] stringArray = arrayList1.toArray(new String[0]);
        Arrays.stream(stringArray).forEach(System.out::println);
        System.out.println("-------------------массив-стрингов-------------------");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
        arrayList2.add("Igor");
        System.out.println(arrayList2);

        arrayList1.removeAll(arrayList2);
        System.out.println("removeAll " + arrayList1);

        arrayList1.add(1,"Ivan");
        arrayList1.add(arrayList1.size()-1,"Mariya");


        arrayList1.retainAll(arrayList2);
        System.out.println("retainAll " + arrayList1);

        System.out.println("containsAll " + arrayList2.containsAll(arrayList1));
        System.out.println("containsAll " + arrayList1.containsAll(arrayList2));

        arrayList2.add("Evgeniy");

        System.out.println("new arrayList 2 = " + arrayList2);

        List<String> myList = arrayList2.subList(1, 3); // [...)
        System.out.println("Sub list = " + myList);

        myList.add("Fedor");

        System.out.println(myList);
        System.out.println(arrayList2);

        arrayList2.add("Sveta");
        System.out.println(arrayList2);
        /*System.out.println(myList); Тут вылетит ConcurrentModificationException
                                      Пояснение: саблист является view на лист, из которого он сделан
                                      при попытке модификации не через view, а через оригинальный лист,
                                      и последующей попытке обратиться к view с целью, например, вывода
                                      в консоль, вылетает ошибка
        * */

        List<Integer> immutableList = List.of(3, 8, 13);
        System.out.println(immutableList);
        /*immutableList.add(12); UnsupportedOperationException
                                 нельзя менять в таком листе элементы, добавлять элементы
                                 и тд., он неизменяемый
        * */

        List<String> copyImmutableList = List.copyOf(arrayList2);
        System.out.println(copyImmutableList);
        /*copyImmutableList.add("vava"); Как и в первом случае, этот лист иммутабельный
                                         любые попытки его изменить приводят к ошибке
                                            Также особенностью этих двух способов создания
                                         листа является то, что элементами не могут быть null
                                         (вылетит NullPointerException)
        * */


    }


}
