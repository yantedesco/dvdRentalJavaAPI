package com.residencia.dvdrental.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FilmActorPK implements Serializable {
    private Short actorId;
    private Short filmId;

    @Column(name = "actor_id")
    @Id
    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    @Column(name = "film_id")
    @Id
    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }
}
