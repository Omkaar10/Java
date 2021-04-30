package com.Polymorphism;

public class JohnWick extends Movie{

    public JohnWick() {
        super("John Wick");
    }

    @Override
    public String moviePlot() {
        return "A man kills people for hurting his dog";
    }
}
