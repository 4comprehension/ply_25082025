package com.pivovarit.domain.rental;

import com.pivovarit.domain.rental.api.MovieAddRequest;
import com.pivovarit.domain.rental.api.MovieData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class RentalFacadeTest {

    private RentalFacade facade;

    @BeforeEach
    void setup() {
        facade = instance();
    }

    @Test
    void shouldSaveMovie() {
        facade.addMovie(new MovieAddRequest(1, "Spiderman", "NEW"));
        assertThat(facade.findById(1)).contains(new MovieData(1L, "Spiderman", Movie.Type.NEW, "foo"));
    }

    @Test
    void shouldFindByTitle() {
        facade.addMovie(new MovieAddRequest(1, "Spiderman", "NEW"));
        assertThat(facade.findByTitle("Spiderman")).contains(new MovieData(1L, "Spiderman", Movie.Type.NEW, "foo"));
    }

    public static RentalFacade instance() {
        return new RentalFacade(new InMemoryMovieRepository(), id -> Optional.of("foo"));
    }
}
