package org.course.multithreading.interaction.deadlock;

public class DeadLockEx {
    private static final Object paper = new Object();
    private static final Object scissors = new Object();

    public static void main(String[] args) {
        Thread masha = new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName() + ": Сейчас буду вырезать из бумаги солнышко");
                    synchronized (scissors){
                        System.out.println(Thread.currentThread().getName() + ": Взяла ножницы");
                        synchronized (paper){
                            System.out.println(Thread.currentThread().getName() + ": Взяла бумагу, теперь у меня полный набор");

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                            System.out.println(Thread.currentThread().getName() + ": Солнышко готово");
                        }
                        System.out.println(Thread.currentThread().getName() + ": Бумага свободна, Даша, можешь брать");
                    }
                    System.out.println(Thread.currentThread().getName() + ": Ножницы тоже свободны");
                }
        );
        masha.setName("Masha");

        Thread dasha = new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName() + ": Сейчас буду вырезать из бумаги облачко");
                    synchronized (paper){
                        System.out.println(Thread.currentThread().getName() + ": Взяла ножницы");
                        synchronized (scissors){
                            System.out.println(Thread.currentThread().getName() + ": Взяла бумагу, теперь у меня полный набор");

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                            System.out.println(Thread.currentThread().getName() + ": Облачко готово");
                        }
                        System.out.println(Thread.currentThread().getName() + ": Бумага свободна, Маша, можешь брать");
                    }
                    System.out.println(Thread.currentThread().getName() + ": Ножницы тоже свободны");
                }
        );
        dasha.setName("Dasha");

        masha.start();
        dasha.start();
    }
}