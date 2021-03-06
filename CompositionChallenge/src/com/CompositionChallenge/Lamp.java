package com.CompositionChallenge;

public class Lamp {

    private String style;
    private int globRating;
    private boolean battery;

    public Lamp(String style, int globRating, boolean battery) {
        this.style = style;
        this.globRating = globRating;
        this.battery = battery;
    }

    public void turnOn() {

        System.out.println("Lamp -> turning on|");
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }




}
