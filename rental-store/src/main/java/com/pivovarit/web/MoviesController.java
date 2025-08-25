package com.pivovarit.web;

import com.pivovarit.domain.rental.RentalFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MoviesController {

    private final RentalFacade movieFacade;

    MoviesController(RentalFacade movieFacade) {
        this.movieFacade = movieFacade;
    }

    @GetMapping("/movies/{id}")
    public Optional<MovieResponse> getMovieById(@PathVariable int id) {
        return movieFacade.findById(id)
          .map(m -> new MovieResponse(m.id().id(), m.title(), m.type().toString()));
    }

    public record MovieResponse(long id, String title, String type) {
    }
}
