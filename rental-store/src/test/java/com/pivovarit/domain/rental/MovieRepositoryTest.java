package com.pivovarit.domain.rental;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class MovieRepositoryTest {

    abstract MovieRepository instance();

    @Test
    void shouldAdd() {
        var repository = instance();
        var movie = new Movie(new Movie.Id(1), "Spiderman", Movie.Type.NEW);

        repository.save(movie);
        assertThat(repository.findAll()).containsExactly(movie);
    }

    public static class InMemoryMovieRepositoryTest extends MovieRepositoryTest {

        @Override
        MovieRepository instance() {
            return new InMemoryMovieRepository();
        }
    }
}
