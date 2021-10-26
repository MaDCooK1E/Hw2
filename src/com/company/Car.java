package com.company;

public class Car {
    int maxSpeed;
    int engineVolume;
    int weight;


    public Car(int maxSpeed, int engineVolume, int weight) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.engineVolume = engineVolume;

    }

    public String winRate(Car car) {
        if (this.maxSpeed > car.maxSpeed)
            return "У первой больше шансов";
        else if (this.maxSpeed < car.maxSpeed)
            return "У второй больше шансов";
        else return "Одинаковые  шансы";


    }

    public String equals(Car car) {
        if (this.maxSpeed != car.maxSpeed || this.engineVolume != engineVolume || this.weight != weight)
            return "Машины разные.";
        else return "Машины одинаковые.";


    }


}
