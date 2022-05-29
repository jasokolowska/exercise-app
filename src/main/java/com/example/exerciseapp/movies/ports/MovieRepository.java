package com.example.exerciseapp.movies.ports;

import com.example.exerciseapp.movies.domain.Movie;

import java.util.Optional;

public interface MovieRepository {

    Movie save(Movie movie);
    Optional<Movie> getById(long id);

}
