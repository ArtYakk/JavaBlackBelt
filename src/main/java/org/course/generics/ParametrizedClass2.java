package org.course.generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 1);
        System.out.println(pair.getFirstValue());
        System.out.println(pair.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(314, 2.71);
        System.out.println(pair2.getFirstValue());
        System.out.println(pair2.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<>("Hello", "Bye");
        System.out.println(otherPair.getFirstValue());
        System.out.println(otherPair.getSecondValue());
    }
}

class Pair <V1, V2>{
    private V1  value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }
}

class OtherPair <V>{
    private V  value1;
    private V value2;

    public OtherPair(V value1, V value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue(){
        return value1;
    }

    public V getSecondValue(){
        return value2;
    }
}
