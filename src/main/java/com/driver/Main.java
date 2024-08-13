package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        // Test Vehicle, Car, and F1
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        vehicle.move(60, 30);
        vehicle.steer(15);
        vehicle.stop();

        Car car = new Car("Sedan", 4, 4, 5, true, "SUV", 5);
        car.changeGear(3);
        car.changeSpeed(80, 45);

        F1 f1 = new F1("Formula1", true);
        f1.accelerate(100);
        f1.accelerate(200);
        f1.accelerate(-300);

        // Test Boat
        Boat boat = new Boat("Sailboat", 10);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());

    }
}