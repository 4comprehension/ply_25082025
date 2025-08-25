package com.pivovarit.domain.rental;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryMovieRepository implements MovieRepository {

    private final Map<Movie.Id, Movie> movies = new ConcurrentHashMap<>();

    @Override
    public void save(Movie movie) {
        Objects.requireNonNull(movie);
        movies.put(movie.id(), movie);
    }

    @Override
    public Collection<Movie> findAll() {
        return movies.values();
    }

    @Override
    public Optional<Movie> findByTitle(String title) {
        return movies.values().stream()
          .filter(movie -> movie.title().equals(title))
          .findFirst();
    }

    @Override
    public Optional<Movie> findById(Movie.Id id) {
        return Optional.ofNullable(movies.get(id));
    }
}
