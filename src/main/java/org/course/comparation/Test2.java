package org.course.comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Vasya", "Petrov", 1500);
        Employee emp2 = new Employee(3, "Elena", "Zhitineva", 2500);
        Employee emp3 = new Employee(5, "Egor", "Solntsev", 1000);
        Employee emp4 = new Employee(2, "Mariya", "Gu", 2300);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        Employee[] employeesArr = {emp1, emp2, emp3, emp4};

        System.out.println("Array pre sort");
        System.out.println(Arrays.toString(employeesArr));

        Arrays.sort(employeesArr); // Если не реализовать Comparable в Employee,
                                   // компилятор ругаться не будет, ошибка вылетит в runtime

        System.out.println("Array post sort");
        System.out.println(Arrays.toString(employeesArr));

        System.out.println(list.get(0).compareTo(list.get(1)));

        System.out.println("Pre sort");
        System.out.println(list);

        Collections.sort(list); // В данном же случае если не реализовать Comparable,
                                // ошибка будет выявлена на этапе компиляции

        System.out.println("Post sort");
        System.out.println(list);


    }

}

class Employee implements Comparable<Employee>{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(Integer id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
//        if(this.id == e.id) {
//            return 0;
//        } else if(this.id < e.id) {
//            return -1;
//        } else {
//            return 1;
//        }


//        return this.id - e.id;

//        return this.id.compareTo(e.id);

        int res = this.name.compareTo(e.name);
        if(res == 0){
            return this.surname.compareTo(e.surname);
        }
        return res;
    }
}
