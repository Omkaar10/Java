package com.PolymorphismChallenge;

public class Main {

    public static void main(String[] args) {


        Mitsubishi mitsubishi = new Mitsubishi(8,"XLR-100");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }
}
