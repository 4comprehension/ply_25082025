package com.pivovarit.domain.descriptions;

import com.pivovarit.domain.rental.Movie;

import java.util.Optional;

public class DescriptionsFacade {
    public Optional<Description> getDescription(Movie.Id id) {
        if (id.id() == 1) {
            return Optional.of("""
              Spider-Man seeks the help of Doctor Strange to forget his exposed secret identity as Peter Parker.
              Howeveir, Strange's spell goes horribly wrong, leading to unwanted guests entering their universe.
              """).map(Description::new);
        } else if (id.id() == 2) {
            return Optional.of("Inception is a 2010 science fiction action heist film written and directed by Christopher Nolan")
              .map(Description::new);
        } else if (id.id() == 3) {
            return Optional.of("""
              S.H.I.E.L.D. leader Nick Fury is compelled to launch the Avengers programme when Loki poses a threat to planet Earth.
              But the superheroes must learn to work together if they are to stop him in time.
              """).map(Description::new);
        } else {
            return Optional.empty();
        }
    }
}
