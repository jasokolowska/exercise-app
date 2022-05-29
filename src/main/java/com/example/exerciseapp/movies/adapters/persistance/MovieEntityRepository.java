package com.example.exerciseapp.movies.adapters.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieEntityRepository extends JpaRepository<MovieEntity, Long> {
}
