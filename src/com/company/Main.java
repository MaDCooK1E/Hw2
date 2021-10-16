package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(120, 3, 10);
        Car car2 = new Car(110, 3, 10);
        System.out.println(equals(car1,car2));
    }

    public static boolean equals(Car car1, Car car2) {
        boolean d = true;
        if (car1.getEngineVolume() != car2.getEngineVolume()) {
            d = false;
        }
        if (car1.getMaxSpeed() != car2.getMaxSpeed()) {
            d = false;
        }
        if (car1.getWeight() != car1.getWeight()) {
            d = false;
        }
        return d;


    }
}