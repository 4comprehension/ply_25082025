package com.pivovarit.domain.rental;

import com.pivovarit.domain.rental.api.MovieAddRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertThat(facade.findById(1)).contains(new Movie(new Movie.Id(1), "Spiderman", Movie.Type.NEW));
    }

    @Test
    void shouldFindByTitle() {
        facade.addMovie(new MovieAddRequest(1, "Spiderman", "NEW"));
        assertThat(facade.findByTitle("Spiderman")).contains(new Movie(new Movie.Id(1), "Spiderman", Movie.Type.NEW));
    }

    public static RentalFacade instance() {
        return new RentalFacade(new InMemoryMovieRepository());
    }
}
