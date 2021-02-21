package Lesson11;

public class Car {
    String color;
    String engine;
    int doorQuantity;


    public Car(String color, String engine, int doorQuantity) {
        this.color = color;
        this.engine = engine;
        this.doorQuantity = doorQuantity;
    }
}

class CarTest {

    public void changeDoorsQuantity(Car car, int doorsQuantity) {

        car.doorQuantity = doorsQuantity;

    }

    public void swap(Car car1, Car car2) {
        String color3 = car1.color;
        car1.color = car2.color;
        car2.color = color3;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V6", 4);
        Car car2 = new Car("blue", "V8", 2);

        CarTest test = new CarTest();
        test.changeDoorsQuantity(car1, 5);

        test.swap(car1, car2);

        System.out.println("The first\n color: " + car1.color + " engine: " + car1.engine + " doorcount: " + car1.doorQuantity);
        System.out.println("The second\n color: " + car2.color + " engine: " + car2.engine + " doorcount: " + car2.doorQuantity);


    }
}
