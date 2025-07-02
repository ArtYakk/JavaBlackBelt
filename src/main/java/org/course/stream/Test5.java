package org.course.stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3,8,1,5,9,12,4,21,81,7,18};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        int res = Arrays.stream(array)
                .filter(a -> a%2 != 0)
                .map(a -> a%3 == 0 ? a/3 : a)
                .reduce((a,b) -> a + b)
                .orElse(0);
        System.out.println(res);
    }
}
