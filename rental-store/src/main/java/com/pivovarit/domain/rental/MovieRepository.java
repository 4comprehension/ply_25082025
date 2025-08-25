package com.pivovarit.domain.rental;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

class MovieRepository {

    public Movie.Id save(Movie movie) {
        return new Movie.Id(42);
    }

    public Collection<Movie> findAll() {
        return Arrays.asList(new Movie(new Movie.Id(42), "foo", Movie.Type.NEW));
    }

    public Optional<Movie> findByTitle(String title) {
        return Optional.of(new Movie(new Movie.Id(42), "foo", Movie.Type.NEW));
    }

    public Optional<Movie> findById(Movie.Id id) {
        return Optional.of(new Movie(new Movie.Id(42), "foo", Movie.Type.NEW));
    }
}
