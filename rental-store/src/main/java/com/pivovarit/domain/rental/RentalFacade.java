package com.pivovarit.domain.rental;

import com.pivovarit.domain.rental.api.MovieAddRequest;
import com.pivovarit.domain.rental.api.MovieData;

import java.util.Optional;
import java.util.function.Function;

public class RentalFacade {

    private final MovieRepository movieRepository;
    private final DescriptionsRepository descriptionsRepository;

    RentalFacade(MovieRepository movieRepository, DescriptionsRepository descriptionsRepository) {
        this.movieRepository = movieRepository;
        this.descriptionsRepository = descriptionsRepository;
    }

    public Optional<MovieData> findById(int id) {
        return movieRepository.findById(new Movie.Id(id)).map(toMovieData());
    }

    public void addMovie(MovieAddRequest movieAddRequest) {
        movieRepository.save(new Movie(new Movie.Id(movieAddRequest.id()), movieAddRequest.title(), Movie.Type.valueOf(movieAddRequest.type())));
    }

    public Optional<MovieData> findByTitle(String title) {
        return movieRepository.findByTitle(title).map(toMovieData());
    }

    private Function<Movie, MovieData> toMovieData() {
        return m -> from(m, descriptionsRepository.getDescription(m.id()).orElse(null));
    }

    public MovieData from(Movie movie, String description) {
        return new MovieData(movie.id().id(), movie.title(), movie.type(), description);
    }
}
