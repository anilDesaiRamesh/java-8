package com.anil.java8.consumer.movieInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieInformationUtility {
    public static List<Movie> populateData() {

        List<Movie> list = new ArrayList<>();
        list.add(getMovieInfo("Bahubali","Prabas","Anushka"));
        list.add(getMovieInfo("Mechanic","Jason Statham","Jessica Alba"));
        list.add(getMovieInfo("The Lost City of Z","Charlie Hunnam","NA"));
        list.add(getMovieInfo("Papillon","Charlie Hunnam","NA"));
        return list;
    }

    private static Movie getMovieInfo(String stMovieName, String stHero, String stHeroine) {
        return new Movie(stMovieName,stHero,stHeroine);
    }

    public static void displayMovieInfo(List<Movie> movies) {

        Consumer<Movie> consumer = movie -> {
            System.out.println("*******************************");
            System.out.println("Movie Name - " + movie.getStName());
            System.out.println("Hero - " + movie.getSthero());
            System.out.println("Heroine - " + movie.getStHeroine());
            System.out.println();
        };

        for(Movie movie : movies){
            consumer.accept(movie);
        }

    }
}
