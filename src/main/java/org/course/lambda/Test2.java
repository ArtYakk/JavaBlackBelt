package org.course.lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("privet"));
    }

    static void defW(W w){
        System.out.println(w.abc());
    }

    public static void main(String[] args) {
        int i = 100;
        def(a -> a.length());
        def(String::length);
        def((String s) -> {return s.length();});
        /*i = 2; !!! нельзя! в тело лямбда выражения можно передавать только final или effectively-final переменные
        * */
        W w = () -> 300 + i;

        defW(() -> 214);
        defW(w);
    }
}

interface I{
    int abc(String s);
}

interface W{
    int abc();
}

