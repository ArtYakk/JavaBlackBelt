package org.course.collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        /* Можно не реализовывать Comparable в классе - ключе, в просто передать Comparator
        как анонимный класс и тут же реализовать compare
            Компаратор можно было реализовать с помощью лямбды
            Также компаратор можно было бы реализовать в виде отдельного класса, имплементирующего Comparator
        * */
        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res = o1.name.compareTo(o2.name);
                if(res == 0){
                    res = o1.surname.compareTo(o2.surname);
                }
                if(res == 0){
                    res = o1.course - o2.course;
                }
                return res;
            }
        });
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        Student st8 = new Student("Elena", "Sidorova", 4);
        Student st9 = new Student("Petr", "Sidorov", 4);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(9.1, st7);
        treeMap.put(8.2, st6);
        treeMap.put(9.2, st8);
        treeMap.put(9.2, st9);

        System.out.println(treeMap);

//        Student st10 = new Student("Elena", "Sidorova", 4);
//        System.out.println(treeMap.containsKey(st10));

       /* System.out.println(treeMap);
        System.out.println(treeMap.get(9.2));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());

        System.out.println("Вывести отсортированные элементы начиная с элемента key: treeMap(key = 7.5)");
        System.out.println(treeMap.tailMap(7.5));

        System.out.println("Вывести отсортированные элементы, заканчивая элементом, стоящим до key: tailMap(key = 7.5)");
        System.out.println(treeMap.headMap(7.5));

        System.out.println("lastEntry()");
        System.out.println(treeMap.lastEntry());

        System.out.println("firstEntry()");
        System.out.println(treeMap.firstEntry());
*/


    }
}
