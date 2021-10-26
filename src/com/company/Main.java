package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(120, 3, 10);
        Car car2 = new Car(110, 3, 10);
        System.out.println(car1.equals(car2));
        System.out.println(car1.winRate(car2));
    }


}
