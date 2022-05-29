package com.example.exerciseapp.movies.adapters.web;

import com.example.exerciseapp.movies.domain.Movie;
import com.example.exerciseapp.movies.domain.NewMovie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WebMovieMapper {

    MovieViewModel toViewModel(NewMovie movie);
    NewMovie toDomain(MovieViewModel movieViewModel);
}
