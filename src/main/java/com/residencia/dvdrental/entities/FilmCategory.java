package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "film_category")
@IdClass(FilmCategoryPK.class)
public class FilmCategory {

    private Integer filmId;
    private Integer categoryId;
    private Timestamp lastUpdate;
    private Film filmByFilmId;
    private Category categoryByCategoryId;

    @Id
    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    @Id
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    public Film getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(Film filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }
}
