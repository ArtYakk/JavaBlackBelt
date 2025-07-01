package org.course.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    /*void testStudents(ArrayList<Student> students, StudentChecks sc){
        for(Student s : students){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }*/

    void testStudents(ArrayList<Student> students, Predicate<Student> p){
        for(Student s : students){
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }



//    void printStudentOverGrade(ArrayList<Student> students, double grade){
//        for(Student s : students){
//            if(s.avgGrade > grade){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> students, int age){
//        for(Student s : students){
//            if(s.age < age){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> students, int age, double grade, char sex){
//        for(Student s : students){
//            if(s.age > age && s.avgGrade < grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//    }
}


class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 24, 4, 7.8);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'm', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Collections.sort(students, Comparator.comparing((Student a) -> a.name)
                .thenComparingInt(a -> a.age).reversed()
                .thenComparingDouble(a -> a.avgGrade));


        System.out.println(students);

        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(students, new CheckOverGrade());
        System.out.println("----------------------------------------------------------");
//        studentInfo.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.avgGrade > 8;
//            }
//        });
        System.out.println("----------------------------------------------------------");
        studentInfo.testStudents(students, s -> s.avgGrade > 9);
        System.out.println("----------------------------------------------------------");
        studentInfo.testStudents(students, s -> s.age < 24);
        System.out.println("----------------------------------------------------------");
        Predicate<Student> predicate1 = s -> s.avgGrade > 9;
        Predicate<Student> predicate2 = s -> s.age < 24;
        Predicate<Student> predicate3 = predicate1.and(predicate2).negate();
        studentInfo.testStudents(students, predicate3);

        Function<Student, Double> function = a -> a.avgGrade;
        double result = avgOfSomething(students, function);
        System.out.println(result);

        System.out.println(avgOfSomething(students, a -> (double)a.course));
        System.out.println(avgOfSomething(students, a -> (double)a.age));




//                studentInfo.printStudentOverGrade(students, 7.7);
//        System.out.println("-----------------------------------------------------------------------");
//        studentInfo.printStudentUnderAge(students, 20);
//        System.out.println("-----------------------------------------------------------------------");
//        studentInfo.printStudentsMixCondition(students, 24, 8.9, 'm');

    }
    public static double avgOfSomething(List<Student> list, Function<Student, Double> function){
        double result = 0;

        for (Student s : list){
            result += function.apply(s);
        }
        result = result/list.size();

        return result;
    }
}

interface StudentChecks{
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}