package org.course.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info = new Info<>("Hello!");
        System.out.println(info);

       // Integer a = info.getValue(); // Компилятор ругается

        Info<Integer> info2 = new Info<>(1123);
        System.out.println(info2);


    }
}

class Info  <T>{
    private T value;

    public Info(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public String toString(){
        return "{[" + value + "]}";
    }
}
