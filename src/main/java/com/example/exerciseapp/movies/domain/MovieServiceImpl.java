package com.example.exerciseapp.movies.domain;

import com.example.exerciseapp.movies.ports.MovieRepository;
import com.example.exerciseapp.movies.ports.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Movie save(NewMovie movie) {
        Movie newMovie = Movie.builder()
                .id(movie.getId())
                .name(movie.getName())
                .director(movie.getDirector())
                .build();
        return movieRepository.save(newMovie);
    }

    @Override
    public Movie getById(long id) {
        return movieRepository.getById(id).orElseThrow(MovieNotFoundException::new);
    }
}
