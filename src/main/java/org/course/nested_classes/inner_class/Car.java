package org.course.nested_classes.inner_class;


public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount/*, int horsePower*/) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine /*extends Z*/ {
        private int horsePower;
        public static int a;
        public static final int b = 25;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            /*System.out.println(doorCount); Можно спокойно обращаться к полям outer класса,
            даже к приватным
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

        Car car = new Car("Black", 5);
        Car.Engine engine = car.new Engine(200);

        /*Car.Engine engine1 = new Car("Black", 5).new Engine(140);*/

        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
    }
}
