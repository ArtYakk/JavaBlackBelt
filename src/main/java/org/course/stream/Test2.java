package org.course.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Test2 {
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

        System.out.println("====================================================");
        students.stream()
                .map(a -> {
                    a.setName(a.getName().toUpperCase());
                    return a;
                })
                .filter(a -> a.getSex() == 'f')
                .sorted((a,b) -> a.getAge() - b.getAge())
                .forEach(System.out::println);

        System.out.println("====================================================");

        System.out.println("---------------------Отсортированный-лист----------------------------------");
        students = students.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).toList();
        System.out.println(students);
        System.out.println("---------------------Отсортированный-лист----------------------------------");

        System.out.println(students.stream()
                .filter(a -> a.getAge() > 22 && a.getAvgGrade() < 7.2)
                .toList());

        Stream<Student> stream = Stream.of(st1, st2, st3, st4, st5);
        System.out.println("------------------Stream.of()-----------------------");
        stream.forEach(System.out::println);
        System.out.println("------------------Stream.of()-----------------------");
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
