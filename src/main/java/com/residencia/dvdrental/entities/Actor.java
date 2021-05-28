package com.residencia.dvdrental.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Actor {
    private Integer actorId;
    private String firstName;
    private String lastName;
    private Timestamp lastUpdate;
    private List<FilmActor> filmActorsByActorId;

    @Id
    @Column(name = "actor_id")
    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }


    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @OneToMany(mappedBy = "actorByActorId")
    public List<FilmActor> getFilmActorsByActorId() {
        return filmActorsByActorId;
    }

    public void setFilmActorsByActorId(List<FilmActor> filmActorsByActorId) {
        this.filmActorsByActorId = filmActorsByActorId;
    }
}
