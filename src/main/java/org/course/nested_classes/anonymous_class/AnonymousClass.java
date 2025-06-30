package org.course.nested_classes.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math2 m = new Math2(){
            int c = 10;
            void abc(){
                System.out.println("ABC");
            }
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(19, 28));

        Math2 m2 = new Math2(){
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m2.doOperation(5,3));

    }

}

interface Math2{
    int doOperation(int a, int b);
}
