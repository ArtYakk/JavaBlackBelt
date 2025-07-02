package org.course.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("alex", 'm', 25, 4, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses = students.stream()
                .mapToInt(a -> a.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        int sum = students.stream()
                .mapToInt(a -> a.getCourse())
                .sum();
        System.out.println("Sum = " + sum);

        double average = students.stream()
                .mapToInt(a -> a.getCourse())
                .average().getAsDouble();

        System.out.println("Average = " + average);

        int min = students.stream()
                .mapToInt(a -> a.getCourse())
                .min().getAsInt();
        System.out.println("Min = " + min);

        int max = students.stream()
                .mapToInt(a -> a.getCourse())
                .max().getAsInt();
        System.out.println("Max = " + max);


//       Student min =  students.stream()
//               .min((a,b) -> a.getAge() - b.getAge())
//               .get();
//       System.out.println(min);
//
//        Student max =  students.stream()
//                .max((a,b) -> a.getAge() - b.getAge())
//                .get();
//        System.out.println(max);
//        students.stream()
//                .filter(a -> a.getAge() > 20)
//                .forEach(System.out::println);
//
//        System.out.println("-------------limit-2------------------------------------------");
//
//        students.stream()
//                .filter(a -> a.getAge() > 20)
//                .limit(2)
//                .forEach(System.out::println);
//
//        System.out.println("--------------skip-2-----------------------------------------");
//
//        students.stream()
//                .filter(a -> a.getAge() > 20)
//                .skip(2)
//                .forEach(System.out::println);

    }
}
