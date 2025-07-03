package org.course.multithreading;

public class Ex3_1 implements Runnable{
    private final String name;

    public Ex3_1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<=1000; i++){
            System.out.println(getName() + " " + i);
        }
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Ex3_1 task1 = new Ex3_1("FIRST");
        Thread thread1 = new Thread(task1);
        thread1.start();

        for(int i=0; i<=1000; i++){
            System.out.println("MAIN " + i);
        }

    }
}