package org.course.multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
        /* Почему произошел deadlock? Потому что потоки блокируют локи (синхронизируются на объектах 1 и 2)
           в разной последовательности, а потом вынуждены бесконечно ждать друг друга
           Чтобы избежать такой ситуации, нужно чтобы потоки блокировали объекты в строго одинаковой последовательности
           сначала 1, потом 2
        * */
    }
}


class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread10: монитор объекта lock1 захвачен");

            System.out.println("Thread10: попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread10: мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: попытка захватить монитор объекта lock2");
        synchronized (DeadLockEx.lock2){
            System.out.println("Thread20: монитор объекта lock2 захвачен");

            System.out.println("Thread20: попытка захватить монитор объекта lock1");
            synchronized (DeadLockEx.lock1){
                System.out.println("Thread20: мониторы объектов lock2 и lock1 захвачены");
            }
        }
    }
}
