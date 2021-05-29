package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "film_category")
@IdClass(FilmCategoryPK.class)
public class FilmCategory {

    @Id
    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    public Film film;
    private Timestamp lastUpdate;
    @Id
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
