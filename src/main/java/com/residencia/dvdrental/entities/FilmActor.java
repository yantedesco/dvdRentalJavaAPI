package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "film_actor")
@IdClass(FilmActorPK.class)
public class FilmActor {

    @Id
    @ManyToOne
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    public Actor actor;

    @Id
    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    public Film film;

    private Timestamp lastUpdate;

    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
