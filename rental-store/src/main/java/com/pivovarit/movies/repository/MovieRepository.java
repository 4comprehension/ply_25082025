package com.pivovarit.movies.repository;

import com.pivovarit.movies.domain.Movie;
import com.pivovarit.movies.domain.MovieType;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class MovieRepository {

    public Movie.Id save(Movie movie) {
        return new Movie.Id(42);
    }

    public Collection<Movie> findAll() {
        return Arrays.asList(new Movie(new Movie.Id(42), "foo", MovieType.NEW));
    }

    public Optional<Movie> findByTitle(String title) {
        return Optional.of(new Movie(new Movie.Id(42), "foo", MovieType.NEW));
    }

    public Optional<Movie> findById(Movie.Id id) {
        return Optional.of(new Movie(new Movie.Id(42), "foo", MovieType.NEW));
    }
}
