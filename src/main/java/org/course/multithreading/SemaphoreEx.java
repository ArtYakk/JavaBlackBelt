package org.course.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Person("Zaur", semaphore);
        new Person("Oleg", semaphore);
        new Person("Elena", semaphore);
        new Person("Viktor", semaphore);
        new Person("Marina", semaphore);

    }
}

class Person extends Thread{
    String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            semaphore.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(2000);
            System.out.println(name + " завершил(а) звонок");
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
    }
}
