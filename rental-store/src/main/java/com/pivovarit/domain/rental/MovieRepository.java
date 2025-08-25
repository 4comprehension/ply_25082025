package com.pivovarit.domain.rental;

import java.util.Collection;
import java.util.Optional;

interface MovieRepository {
    void save(Movie movie);

    Collection<Movie> findAll();

    Optional<Movie> findByTitle(String title);

    Optional<Movie> findById(Movie.Id id);
}
