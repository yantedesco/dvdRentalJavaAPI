package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "film_actor", schema = "public", catalog = "dvdrental")
@IdClass(FilmActorPK.class)
public class FilmActor {
    private Short actorId;
    private Short filmId;
    private Timestamp lastUpdate;
    private Actor actorByActorId;
    private Film filmByFilmId;

    @Id
    @Column(name = "actor_id")
    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    @Id
    @Column(name = "film_id")
    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }


    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @ManyToOne
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    public Actor getActorByActorId() {
        return actorByActorId;
    }

    public void setActorByActorId(Actor actorByActorId) {
        this.actorByActorId = actorByActorId;
    }

    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    public Film getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(Film filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }
}
