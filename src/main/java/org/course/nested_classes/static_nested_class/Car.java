package org.course.nested_classes.static_nested_class;

public class Car {
    static int a;
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(240);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    interface I{
        interface example{}
        class ClassExample{}
    }

    public /*private*/ static /*final*/ class Engine /*extends Z*/ {
        private int horsePower;
        static int countOfObjects;


        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;

            System.out.println(a);
            /*System.out.println(doorCount); NO! doorCount is a non-static variable
            * */
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(180);
        System.out.println(engine);
        Car car = new Car("red", 5, engine);
        System.out.println(car);
    }
}

/*
class Z extends Car.Engine{
    public Z(int horsePower) {
        super(horsePower);
    }
}*/
