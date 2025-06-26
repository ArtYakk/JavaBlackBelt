package org.course.collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        System.out.println(map);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        boolean result = map.containsKey(st4);
        System.out.println("Result = " + result);

        System.out.println("Students hashCodes");
        System.out.println("st1 " + st1.hashCode());
        System.out.println("st2 " + st2.hashCode());


        System.out.println("Enhanced for loop");
        for(Map.Entry<Student, Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Foreach");
        map.entrySet().forEach(System.out::println);
        map.values().forEach(System.out::println);

        /* По достижении количества элементов 0.75*16 размер внутреннего массива увеличится в 2 раза
        * */
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

        /* Ключ должен быть иммутабельным, все поля должны быть final, а также и класс
        можно сделать final, чтобы у него не было наследников, если ключ мутабелен,
        изменив что-то в ключе, мы теряем свящь с объектом который хранится по этому
        ключу
        * */
        System.out.println("Заур на месте? " + map.containsKey(st1));
        System.out.println("Заура переводим с 3 на 1 курс");
       // st1.course = 1;
        System.out.println("А теперь Заур на месте? " + map.containsKey(st1));



    }

}

class Student implements Comparable<Student>{
   /*private*/ final String name;
   /*private*/ final String surname;
   /*private*/ final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course &&
//                Objects.equals(name, student.name) &&
//                Objects.equals(surname, student.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return name.length()*7 + surname.length()*11 + course*53;
//    }

    @Override
    public int compareTo(Student o) {
        int res = name.compareTo(o.name);
        if(res == 0){
            res = surname.compareTo(o.surname);
        }
        return res;
    }
}
