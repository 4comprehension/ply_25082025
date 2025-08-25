package com.pivovarit.movies.domain;

public record Movie(Id id, String title, MovieType type) {
    public record Id(long id) {
    }
}
