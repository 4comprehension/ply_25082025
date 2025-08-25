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
        movieRepository.save(new Movie(new Movie.Id(movieAddRequest.id()), movieAddRequest.title(), Movie.Type.valueOf(movieAddRequest.type())));
    }

    public Optional<Movie> findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }
}
