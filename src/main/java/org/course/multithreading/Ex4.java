package org.course.multithreading;

public class Ex4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    System.out.println(i);
                }
            }
        });
        thread.start();
        new Thread(() -> System.out.println("PRIVET")).start();
    }
}
