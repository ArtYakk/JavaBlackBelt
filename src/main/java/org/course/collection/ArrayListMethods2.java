package org.course.collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student student1 = new Student("Artem", 'm', 23, 4, 5.0);
        Student student2 = new Student("Ivan", 'm', 34, 3, 4.0);
        Student student3 = new Student("Nikolay", 'm', 45, 2, 3.9);
        Student student4 = new Student("Elena", 'f', 56, 3, 5.0);
        Student student5 = new Student("Mariya", 'f', 17, 1, 4.7);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);

        Student student6 = new Student("Mariya", 'f', 17, 1, 4.7);
//        studentList.remove(student6);
        int index = studentList.indexOf(student6);
        System.out.println(studentList.get(index));


    }
}

class Student{
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", course='" + course + '\'' +
                ", avgGrade='" + avgGrade + '\'' +
                '}';
    }

    /*@Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())) return false;

        if(!this.name.equals(((Student) obj).name)) return false;
        if(!(this.sex == ((Student) obj).sex)) return false;
        if(!(this.age == ((Student) obj).age)) return false;
        if(!(this.course == ((Student) obj).course)) return false;
        if(!(this.avgGrade == ((Student) obj).avgGrade)) return false;

        return true;
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(avgGrade, student.avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}
