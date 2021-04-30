package com.inheritanceChallenge;

public class Vehicle {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name,String size)
    {
        this.name=name;
        this.size=size;
        this.currentVelocity=0;
        this.currentDirection=0;
    }

    public void steer(int direction)
    {
        this.currentDirection+=direction;
        System.out.println("Current direction is: "+currentDirection);
    }


    public void move(int velocity,int direction)
    {
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("Vehicle is moving at speed "+currentVelocity+" and in direction "+currentDirection);
    }

    public String getName()
    {
        return name;
    }

    public String getSize()
    {
        return size;
    }

    public void stop()
    {
        this.currentVelocity=0;
    }

    public int getCurrentVelocity()
    {
        return currentVelocity;
    }

    public int getCurrentDirection()
    {
        return currentDirection;
    }
}
