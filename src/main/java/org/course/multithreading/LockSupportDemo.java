package org.course.multithreading;

import java.util.concurrent.locks.LockSupport;

public class LockSupportDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Паркуюсь...");
            LockSupport.park(Thread.currentThread());
            System.out.println("Распарковался!");
        });

        thread.start();

        Thread.sleep(2000);
        System.out.println("Вызываем unpark()");
        LockSupport.unpark(thread);
    }
}
