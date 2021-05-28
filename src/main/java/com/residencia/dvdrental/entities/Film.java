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
    private Object releaseYear;
    private Short languageId;
    private Short rentalDuration;
    private BigDecimal rentalRate;
    private Short length;
    private BigDecimal replacementCost;
    private Object rating;
    private Timestamp lastUpdate;
    private Object specialFeatures;
    private Object fulltext;
    private Language languageByLanguageId;
    private List<FilmActor> filmActorsByFilmId;
    private List<FilmCategory> filmCategoriesByFilmId;
    private List<Inventory> inventoriesByFilmId;

    @Id
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


    @Column(name = "release_year")
    public Object getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Object releaseYear) {
        this.releaseYear = releaseYear;
    }


    @Column(name = "language_id")
    public Short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Short languageId) {
        this.languageId = languageId;
    }


    @Column(name = "rental_duration")
    public Short getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }


    @Column(name = "rental_rate")
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
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


    @Column(name = "rating")
    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }


    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    @Column(name = "special_features")
    public Object getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(Object specialFeatures) {
        this.specialFeatures = specialFeatures;
    }


    @Column(name = "fulltext")
    public Object getFulltext() {
        return fulltext;
    }

    public void setFulltext(Object fulltext) {
        this.fulltext = fulltext;
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
    public List<FilmActor> getFilmActorsByFilmId() {
        return filmActorsByFilmId;
    }

    public void setFilmActorsByFilmId(List<FilmActor> filmActorsByFilmId) {
        this.filmActorsByFilmId = filmActorsByFilmId;
    }

    @OneToMany(mappedBy = "filmByFilmId")
    public List<FilmCategory> getFilmCategoriesByFilmId() {
        return filmCategoriesByFilmId;
    }

    public void setFilmCategoriesByFilmId(List<FilmCategory> filmCategoriesByFilmId) {
        this.filmCategoriesByFilmId = filmCategoriesByFilmId;
    }

    @OneToMany(mappedBy = "filmByFilmId")
    public List<Inventory> getInventoriesByFilmId() {
        return inventoriesByFilmId;
    }

    public void setInventoriesByFilmId(List<Inventory> inventoriesByFilmId) {
        this.inventoriesByFilmId = inventoriesByFilmId;
    }
}
