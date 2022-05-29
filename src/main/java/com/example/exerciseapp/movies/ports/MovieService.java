package com.example.exerciseapp.movies.ports;

import com.example.exerciseapp.movies.domain.Movie;
import com.example.exerciseapp.movies.domain.NewMovie;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface MovieService {

    Movie save(NewMovie movie);
    Movie getById(long id);

}
