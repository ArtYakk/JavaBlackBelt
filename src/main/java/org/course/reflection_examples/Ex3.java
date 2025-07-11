package org.course.reflection_examples;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(1, "Zaur", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (Double)field.get(employee);
        System.out.println(salaryValue);
        field.set(employee,5000);
        System.out.println(employee);

    }
}
