package org.course.stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("alex", 'm', 25, 4, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);

        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();

        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(a -> a.getStudentsOnFaculty().stream())
                .forEach(System.out::println);


    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st){
        studentsOnFaculty.add(st);
    }
}
