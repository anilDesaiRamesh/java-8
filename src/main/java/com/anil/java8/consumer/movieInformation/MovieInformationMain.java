package com.anil.java8.consumer.movieInformation;

import java.util.List;

public class MovieInformationMain {

    public static void main(String[] args){


        List<Movie> movies = MovieInformationUtility.populateData();
        MovieInformationUtility.displayMovieInfo(movies);
    }
}
