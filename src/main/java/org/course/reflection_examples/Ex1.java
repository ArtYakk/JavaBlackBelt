package org.course.reflection_examples;

import java.lang.reflect.*;
import java.util.Arrays;


public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("org.course.reflection_examples.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee employee = new Employee();
//        Class employeeClass3 = employee.getClass();
        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());

        System.out.println("*********************************");

        Field[] fields = employeeClass.getFields();
        System.out.println("Class fields with types: ");/* Видны только публичные */
        for(Field field : fields){
            System.out.println(field + " TYPE = " + field.getType());
        }

        System.out.println("*********************************");

       Field[] allFields =  employeeClass.getDeclaredFields();
        System.out.println("Class ALL fields with types: ");/* Видны только публичные */
        for(Field field : allFields){
            System.out.println(field + " TYPE = " + field.getType());
        }

        System.out.println("*********************************");

       Method someMethod = employeeClass.getMethod("increaseSalary");
       System.out.println("Return type of someMethod = " + someMethod.getReturnType() + " | " +
               "Parameter types = " + Arrays.toString(someMethod.getParameterTypes()));

       System.out.println();

        Method method2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of someMethod setSalary = " + method2.getReturnType() + " | " +
                "Parameter types of setSalary = " + Arrays.toString(method2.getParameterTypes()));

        System.out.println();

        Method[] methods = employeeClass.getMethods();
        for(Method method : methods){
            System.out.println("Name of method = " + method.getName() + " | " +
                    "Return type = " + method.getReturnType() + " | " +
                    "Parameter types types = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("*********************************");

        Method[] allMethods = employeeClass.getDeclaredMethods();
        System.out.println("ALL methods including PRIVATE, only from this class, WITHOUT methods from PARENTS");
        for(Method method : allMethods){
            System.out.println("Name of method = " + method.getName() + " | " +
                    "Return type = " + method.getReturnType() + " | " +
                    "Parameter types types = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("*********************************");

        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        System.out.println("ALL methods including PRIVATE, only from this class, WITHOUT methods from PARENTS");
        for(Method method : allMethods2){
            if(Modifier.isPublic(method.getModifiers())){
                System.out.println("Name of method = " + method.getName() + " | " +
                        "Return type = " + method.getReturnType() + " | " +
                        "Parameter types types = " + Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("*********************************");

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() + " parameters, " +
                "their types are " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() + " parameters, " +
                "their types are " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println();

        Constructor[] constructors = employeeClass.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println("Constructor has " + constructor.getParameterCount() + " parameters, " +
                    "their types are " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
