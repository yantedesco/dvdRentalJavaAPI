package com.residencia.dvdrental.entities;

import java.io.Serializable;
import java.util.Objects;

public class FilmCategoryPK implements Serializable {

    private Film film;
    private Category category;

    public FilmCategoryPK() {

    }

    public FilmCategoryPK(Film film, Category category) {
        this.film = film;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmCategoryPK that = (FilmCategoryPK) o;
        return Objects.equals(film, that.film) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(film, category);
    }
}
