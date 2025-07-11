package org.course.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("org.course.reflection_examples.Employee");
//        Employee o = (Employee) employeeClass.newInstance(); // DEPRECATED
//        System.out.println(o);
        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee object1 = constructor1.newInstance();

        Constructor<Employee> constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Employee object2 = constructor2.newInstance(5, "Zaur", "IT");
        System.out.println(object2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(object2,2000);

        System.out.println(object2);
    }
}
