package com.Polymorphism;

public class Movie {
    private String movieName;
    private String moviePlot;

    public Movie(String movieName) {
        this.movieName = movieName;

    }

    public String getMovieName() {
        return movieName;
    }


    public String moviePlot() {
        return "No plot available";
    }
}
