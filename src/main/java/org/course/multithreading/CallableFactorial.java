package org.course.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Factorial2(5));
        try {
            System.out.println(future.isDone());
            System.out.println("Хотим получить результат");
            factorialResult = future.get();
            System.out.println("Получили результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer>{
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if(f<0){
            throw new IllegalArgumentException("Вы ввели отрицательное значение, либо 0");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}