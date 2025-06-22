package org.course.generics;

import java.util.ArrayList;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("asd");
        arrayList.add("fdg");
        arrayList.add("vcb");
        String a = GenMethod.genSecondElement(arrayList);
        System.out.println(a);
    }
}

class GenMethod{
    public static <T> T genSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
