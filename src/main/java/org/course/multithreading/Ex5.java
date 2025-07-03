package org.course.multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.setName("My thread 1");
        thread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread 5 name " + thread5.getName());
        System.out.println("Thread 5 priority " + thread5.getPriority());

        MyThread5 thread6 = new MyThread5();
        thread6.setName("My thread 2");
        thread6.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Thread 6 name " + thread6.getName());
        System.out.println("Thread 6 priority " + thread6.getPriority());
    }
}

class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Privet");
    }
}