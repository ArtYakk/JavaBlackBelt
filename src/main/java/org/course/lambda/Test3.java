package org.course.lambda;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier){
        ArrayList<Car> arrayList = new ArrayList<>();
        for(int i=0; i<3; i++){
            arrayList.add(supplier.get());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Silver Metalic", 1.6));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine += 1;
            System.out.println("Upgraded car: " + car);
        });
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
