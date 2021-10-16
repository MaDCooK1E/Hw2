package com.company;

public class Car {
    private int maxSpeed;
    private int engineVolume;
    private int weight;


    public Car(int maxSpeed, int engineVolume, int weight) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.engineVolume = engineVolume;

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public int getWeight() {
        return weight;
    }
}
