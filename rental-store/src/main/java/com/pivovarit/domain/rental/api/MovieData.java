package com.pivovarit.domain.rental.api;

import com.pivovarit.domain.rental.Movie;

public record MovieData(long id, String title, Movie.Type type, String description) {
}
