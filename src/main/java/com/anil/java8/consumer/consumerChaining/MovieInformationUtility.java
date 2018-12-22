package com.anil.java8.consumer.consumerChaining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MovieInformationUtility {
    public static List<Movie> populateData() {

        List<Movie> list = new ArrayList<>();
        list.add(getMovieInformation("The Lost City of Z ",Result.HIT));
        list.add(getMovieInformation("King Arthur: Legend of the Sword ",Result.SUPER_HIT));
        list.add(getMovieInformation("Papillon ",Result.SUPER_HIT));
        return list;
    }

    private static Movie getMovieInformation(String stName, Result result) {
        return new Movie(stName,result);
    }

    public static void printMovieInformation(List<Movie> movies) {

        Consumer<Movie> consumer1 = movie -> System.out.println("Movie - " + movie.getStName() +"- " +
                "is ready to release");
        Consumer<Movie> consumer2 = movie -> System.out.println("Movie - " + movie.getStName() + "- is just " +
                "released with result - " + movie.getResult());
        Consumer<Movie> consumer3 = movie -> {
            System.out.println("Movie -" + movie.getStName() +"- is awsome");
            System.out.println();
        };

        Predicate<Movie> predicate = movie -> movie.getResult().compareTo(Result.SUPER_HIT)==0 ? true : false ;

        for(Movie movie : movies){
            if(predicate.test(movie))
            consumer1.andThen(consumer2).andThen(consumer3).accept(movie);
        }

    }
}
