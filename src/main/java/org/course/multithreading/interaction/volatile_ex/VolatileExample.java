package org.course.multithreading.interaction.volatile_ex;

public class VolatileExample {
    public static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            System.out.println("Зашли в поток");
            while(!flag) {}
            System.out.println("Вышли из потока, flag стал true");
        }).start();

        Thread.sleep(1000);
        flag = true;
    }
}