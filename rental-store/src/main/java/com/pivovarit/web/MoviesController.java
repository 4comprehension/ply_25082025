package com.pivovarit.web;

import com.pivovarit.domain.rental.RentalFacade;
import com.pivovarit.domain.rental.api.MovieAddRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MoviesController {

    private final RentalFacade movieFacade;

    MoviesController(RentalFacade movieFacade) {
        this.movieFacade = movieFacade;
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<MovieResponse> getMovieById(@PathVariable int id) {
        return ResponseEntity.of(movieFacade.findById(id)
          .map(m -> new MovieResponse(m.id(), m.title(), m.type().toString(), m.description())));
    }

    // curl -X POST -H "Content-Type: application/json" -d '{"id": 1, "title": "The Matrix", "type": "NEW"}' http://localhost:8081/movies
    @PostMapping("/movies")
    public void addMovie(@RequestBody MovieAddRequest movie) {
        movieFacade.addMovie(movie);
    }

    public record MovieResponse(long id, String title, String type, String description) {
    }
}
