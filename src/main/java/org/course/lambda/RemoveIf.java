package org.course.lambda;
import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("privet");
        arrayList.add("poka");
        arrayList.add("hi");
        arrayList.add("merci");
        arrayList.add("ku");
        arrayList.add("terve");
        arrayList.add("bonjour");
        arrayList.add("Grokaem Java");
        arrayList.add("A imenno labmdas");
        arrayList.removeIf(a -> a.length() <= 5);
        System.out.println(arrayList);

        Predicate<String> predicate = a -> a.split(" ").length >= 2;
        arrayList.removeIf(predicate);
        System.out.println(arrayList);
    }
}
