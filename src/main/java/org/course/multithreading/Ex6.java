package org.course.multithreading;

public class Ex6 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Ex6 task = new Ex6();
        Thread thread = new Thread(task);
        thread.start();
       /* thread.run(); Нет смысла запускать run напрямую, потому что таска выполнится в main потоке
       * */
        System.out.println("Method main. Thread name = " +
                Thread.currentThread().getName());
    }
}
