//2
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
}

class Truck extends Vehicle {
}


public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

    }
}
