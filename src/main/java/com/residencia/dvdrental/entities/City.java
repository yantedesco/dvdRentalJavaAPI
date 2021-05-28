package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class City {
    private Integer cityId;
    private String city;
    private Short countryId;
    private Timestamp lastUpdate;
    private List<Address> addressesByCityId;
    private Country countryByCountryId;

    @Id
    @Column(name = "city_id")
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }


    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Column(name = "country_id")
    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }


    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @OneToMany(mappedBy = "cityByCityId")
    public List<Address> getAddressesByCityId() {
        return addressesByCityId;
    }

    public void setAddressesByCityId(List<Address> addressesByCityId) {
        this.addressesByCityId = addressesByCityId;
    }

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    public Country getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(Country countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }
}
