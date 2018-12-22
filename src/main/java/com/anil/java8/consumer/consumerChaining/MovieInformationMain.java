package com.anil.java8.consumer.consumerChaining;

import java.util.List;

public class MovieInformationMain {

    public static void main(String[] args){

        List<Movie> movies = MovieInformationUtility.populateData();
        MovieInformationUtility.printMovieInformation(movies);
    }
}
