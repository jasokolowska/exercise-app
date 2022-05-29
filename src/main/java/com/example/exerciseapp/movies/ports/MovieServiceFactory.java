package com.example.exerciseapp.movies.ports;

public interface MovieServiceFactory {

    MovieService create(MovieRepository movieRepository);

}
