package com.example.exerciseapp.movies.adapters.persistance;

import com.example.exerciseapp.movies.domain.Movie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieEntityMapper {

    MovieEntity toEntity(Movie movie);
    Movie toDomain(MovieEntity entity);

}
