package org.course.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("Hello!");
//        System.out.println(info);
//
//       // Integer a = info.getValue(); // Компилятор ругается
//
//        Info<Integer> info2 = new Info<>(1123);
//        System.out.println(info2);


    }

    /*
        Код снизу говорит о том, что нельзя перегружать методы,
    разница в которых обусловлена разным generic type,
    потому что JVM все равно стирает дженерики, это называется TYPE ERASURE.
        Сделано это для обратной совместимости, чтобы код без дженериков был
    совместим с кодом в котором их нет
        Компилятор видит проблему связанную с type erasure
    * */
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
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

class Parent{
    public void abc(Info<Integer> info){
        Integer i = info.getValue();
    }
}

class Child extends Parent{
    /*
    * Переопределить метод и выбрать другой дженерик тип тоже не выйдет,
    * опять же компилятор указывает на то, что происходит стирание типов после компиляции,
    * и метод по итогу один и тот же
    * */
//    public void abc(Info<String> info){
//        Integer i = info.getValue();
//    }
}
