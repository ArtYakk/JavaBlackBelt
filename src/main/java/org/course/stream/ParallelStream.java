package org.course.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 ..... 1 000 000 000
        // 1 ..... 250 000 000              A
        // 250 000 000 ..... 500 000        B
        // 500 000 000 ..... 750 000        C
        // 750 000 000 ..... 1 000 000 000  D
        // A * B * C * D

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        /* Параллельные стримы подходят для использования агрегирующих функций
           которым не важен порядок, но в случае, где порядок важен, параллельный
           стрим никак не может его гарантировать
           Использовать только когда крайне много элементов, в небольшом стриме
           параллельность может только навредить
           Разделение задания по ядрам и потом сборка тоже занимает время
        * */

//        double sumResult = list.parallelStream()
//                .reduce((a, e) -> a + e)
//                .get();
//        System.out.println("sumResult = " + sumResult);

        double divisionResult = list.stream()
                .reduce((a, e) -> a / e)/* Результат 0.5, хотя мы ждем 8.0
                                                        в данной ситуации важен порядок
                                                        Параллельный стрим тут вредит
                                                        */
                .get();
        System.out.println("sumResult = " + divisionResult);

    }
}
