package com.pivovarit.domain.rental;

public record Movie(Id id, String title, Type type) {
    public record Id(long id) {
    }

    public enum Type {
        NEW, REGULAR, OLD;
    }
}
