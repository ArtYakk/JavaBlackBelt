package org.course.stream;

public class Ex10 {
    public static void main(String[] args) {
        MuRunnableImpl1 runnable = new MuRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter{
    volatile static int count = 0;
}

class MuRunnableImpl1 implements Runnable{
    public synchronized void increment(){
        Counter.count++;
        System.out.println(Counter.count + " ");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
