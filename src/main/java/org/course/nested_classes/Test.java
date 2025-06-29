package org.course.nested_classes;

public class Test {
    static class A{} // static

    class B{} // inner

    void method(){
        class C{} // local
    }

    public static void main(String[] args) {

    }
}
