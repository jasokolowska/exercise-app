package com.example.exerciseapp.movies.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NewMovie {

    private long id;
    private String name;
    private String director;
}
