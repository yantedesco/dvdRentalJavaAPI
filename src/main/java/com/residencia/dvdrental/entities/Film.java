package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Film {
    private Integer filmId;
    private String title;
    private String description;
    private Short length;
    private BigDecimal replacementCost;
    private Timestamp lastUpdate;
    private Language languageByLanguageId;
    private List<Inventory> inventoriesByFilmId;

    @OneToMany(mappedBy = "film")
    private List<FilmCategory> filmByFilmCategoryId;

    @OneToMany(mappedBy = "category")
    private List<FilmCategory> categoryByFilmCategoryId;

    @OneToMany(mappedBy = "actor")
    private List<FilmActor> actorByFilmActorId;

    @OneToMany(mappedBy = "film")
    private List<FilmActor> filmByFilmActorId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "length")
    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    @Column(name = "replacement_cost")
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "language_id")
    public Language getLanguageByLanguageId() {
        return languageByLanguageId;
    }

    public void setLanguageByLanguageId(Language languageByLanguageId) {
        this.languageByLanguageId = languageByLanguageId;
    }

    @OneToMany(mappedBy = "filmByFilmId")
    public List<Inventory> getInventoriesByFilmId() {
        return inventoriesByFilmId;
    }

    public void setInventoriesByFilmId(List<Inventory> inventoriesByFilmId) {
        this.inventoriesByFilmId = inventoriesByFilmId;
    }
}
