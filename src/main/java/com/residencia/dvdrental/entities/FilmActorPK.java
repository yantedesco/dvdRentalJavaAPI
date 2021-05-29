package com.residencia.dvdrental.entities;

import java.io.Serializable;
import java.util.Objects;

public class FilmActorPK implements Serializable {

    private Film film;
    private Actor actor;

    public FilmActorPK() {

    }

    public FilmActorPK(Film film, Actor actor) {
        this.film = film;
        this.actor = actor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmActorPK that = (FilmActorPK) o;
        return Objects.equals(film, that.film) && Objects.equals(actor, that.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(film, actor);
    }
}
