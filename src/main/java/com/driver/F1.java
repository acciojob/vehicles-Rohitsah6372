package com.driver;

public class F1 extends Car {


    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "F1", 1); // Arbitrary values for wheels, doors, gears, and seats
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; // Calculate new speed using the current speed and the rate

        if(newSpeed <= 0) {
            stop(); // Stop the car if new speed is less than or equal to 0
            changeGear(1); // Set gear to 1
        } else {
            if(newSpeed > 0 && newSpeed <= 50) {
                changeGear(1);
            } else if(newSpeed > 50 && newSpeed <= 100) {
                changeGear(2);
            } else if(newSpeed > 100 && newSpeed <= 150) {
                changeGear(3);
            } else if(newSpeed > 150 && newSpeed <= 200) {
                changeGear(4);
            } else if(newSpeed > 200 && newSpeed <= 250) {
                changeGear(5);
            } else {
                changeGear(6); // Any speed above 250
            }

            changeSpeed(newSpeed, getCurrentDirection()); // Change speed and maintain the current direction
        }
    }
}
