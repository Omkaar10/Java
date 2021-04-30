package com.PolymorphismChallenge;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    String carName=getName();

    @Override
    public String startEngine() {

        return carName+" is starting";
    }

    @Override
    public String accelerate() {
        return carName+" is accelerating";
    }

    @Override
    public String brake() {
        return carName+" is braking";
    }
}
