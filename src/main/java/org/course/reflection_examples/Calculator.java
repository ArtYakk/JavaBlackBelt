package org.course.reflection_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b){
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " = " + result);
    }
    void sub(int a, int b){
        int result = a - b;
        System.out.println("Разность " + a + " и " + b + " = " + result);
    }
    void div(int a, int b){
        int result = a / b;
        System.out.println("Частное " + a + " и " + b + " = " + result);
    }
    void mul(int a, int b){
        int result = a * b;
        System.out.println("Произведение " + a + " и " + b + " = " + result);
    }
}


class TestCalculator{
    public static void main(String[] args){

        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/course/reflection_examples/test100.txt"))){
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class c1 = calculator.getClass();
            Method method = null;

            Method[] methods = c1.getDeclaredMethods();
            for(Method myMethod : methods){
                if(myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
