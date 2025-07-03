package org.course.multithreading;

public class Ex2 {
    public static void main(String[] args) {

    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<=1000; i++){
            System.out.println("T1: " + i);
        }

    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=1000; i>0; i--){
            System.out.println("T2: " + i);
        }

    }
}
