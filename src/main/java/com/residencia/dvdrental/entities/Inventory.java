package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Inventory {
    private Integer inventoryId;
    private Timestamp lastUpdate;
    private Film filmByFilmId;
    private List<Rental> rentalsByInventoryId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
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

    @OneToMany(mappedBy = "inventoryByInventoryId")
    public List<Rental> getRentalsByInventoryId() {
        return rentalsByInventoryId;
    }

    public void setRentalsByInventoryId(List<Rental> rentalsByInventoryId) {
        this.rentalsByInventoryId = rentalsByInventoryId;
    }
}
