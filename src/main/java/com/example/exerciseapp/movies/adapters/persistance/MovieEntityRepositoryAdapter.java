package com.example.exerciseapp.movies.adapters.persistance;

import com.example.exerciseapp.movies.domain.Movie;
import com.example.exerciseapp.movies.ports.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Component
@RequiredArgsConstructor
public class MovieEntityRepositoryAdapter implements MovieRepository{

    private final MovieEntityMapper mapper;
    private final MovieEntityRepository movieEntityRepository;


    @Override
    public Movie save(Movie movie) {
        MovieEntity movieEntity = mapper.toEntity(movie);
        MovieEntity savedMovieEntity = movieEntityRepository.save(movieEntity);
        return mapper.toDomain(savedMovieEntity);
    }

    @Override
    public Optional<Movie> getById(long id) {
       return movieEntityRepository.findById(id).map(mapper::toDomain);
    }
}
