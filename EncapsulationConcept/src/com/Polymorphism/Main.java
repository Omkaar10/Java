package com.Polymorphism;

public class Main {

    public static void main(String[] args) {

        for (int i=1;i<11;i++) {
            Movie movie = moviegenerator();

            System.out.println("Movie#"+i+": "+movie.getMovieName());
            System.out.println("Movie plot: "+movie.moviePlot());

        }

        }


    public static Movie moviegenerator() {

        int randomMovie = (int) (Math.random() *5)+2;
        System.out.println("Number is: "+randomMovie);

        switch(randomMovie) {

            case 1:
                return new Avengers();
            case 2:
                return new MazeRunner();
            case 3:
                return new JohnWick();
            case 4:
                return new BatmanVsSuperman();
            case 5:
                return new theImitationGame();
            case 6:
                return new noPlotMovie();

        }
        return null;
    }
}
