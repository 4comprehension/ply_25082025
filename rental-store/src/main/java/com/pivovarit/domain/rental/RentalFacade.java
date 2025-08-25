package com.pivovarit.domain.rental;

import com.pivovarit.domain.rental.api.MovieAddRequest;

import java.util.Optional;

public class RentalFacade {

    private final MovieRepository movieRepository;

    RentalFacade(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findById(int id) {
        return movieRepository.findById(new Movie.Id(id));
    }

    public void addMovie(MovieAddRequest movieAddRequest) {
    }
}
