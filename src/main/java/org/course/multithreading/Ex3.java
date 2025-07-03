package org.course.multithreading;

public class Ex3 extends Thread{

    @Override
    public void run() {
        for(int i=0; i<=1000; i++){
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
//        MyThread3 task1 = new MyThread3();
//        MyThread4 task2 = new MyThread4();
//
//        Thread thread1 = new Thread(task1);
//        Thread thread2 = new Thread(task2);

        Ex3 thread1 = new Ex3();
        Ex3 thread2 = new Ex3();

        thread1.setName("FIRST");
        thread2.setName("SECOND");

        thread1.start();
        thread2.start();
    }
}
//
//class MyThread3 implements Runnable{
//    @Override
//    public void run() {
//        for(int i=0; i<=1000; i++){
//            System.out.println("T1: " + i);
//        }
//
//    }
//}
//
//class MyThread4 implements Runnable{
//    @Override
//    public void run() {
//        for(int i=1000; i>0; i--){
//            System.out.println("T2: " + i);
//        }
//
//    }
//}