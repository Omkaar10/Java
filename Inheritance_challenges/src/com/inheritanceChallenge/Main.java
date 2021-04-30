package com.inheritanceChallenge;

public class Main {

    public static void main(String[] args)
    {
        Buggati buggati = new Buggati(36);
        buggati.accelerate(10);
        buggati.accelerate(20);
        buggati.steer(20);
        buggati.accelerate(20);
        buggati.accelerate(-20);
    }
}
