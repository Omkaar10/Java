package com.Polymorphism;

public class Avengers extends Movie {

    public Avengers() {
        super("Avengers");
    }

    @Override
    public String moviePlot() {
        return "Bunch of heroes assemble to protect earth";
    }
}
