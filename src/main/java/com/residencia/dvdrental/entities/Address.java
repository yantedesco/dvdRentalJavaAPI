package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Address {
    private Integer addressId;
    private String address;
    private String address2;
    private String district;
    private String postalCode;
    private String phone;
    private Timestamp lastUpdate;
    private City cityByCityId;
    private List<Customer> customersByAddressId;
    private List<Staff> staffByAddressId;
    private List<Store> storesByAddressId;

    @Id
    @Column(name = "address_id")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }


    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Column(name = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    @Column(name = "postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Column(name = "last_update")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    public City getCityByCityId() {
        return cityByCityId;
    }

    public void setCityByCityId(City cityByCityId) {
        this.cityByCityId = cityByCityId;
    }

    @OneToMany(mappedBy = "addressByAddressId")
    public List<Customer> getCustomersByAddressId() {
        return customersByAddressId;
    }

    public void setCustomersByAddressId(List<Customer> customersByAddressId) {
        this.customersByAddressId = customersByAddressId;
    }

    @OneToMany(mappedBy = "addressByAddressId")
    public List<Staff> getStaffByAddressId() {
        return staffByAddressId;
    }

    public void setStaffByAddressId(List<Staff> staffByAddressId) {
        this.staffByAddressId = staffByAddressId;
    }

    @OneToMany(mappedBy = "addressByAddressId")
    public List<Store> getStoresByAddressId() {
        return storesByAddressId;
    }

    public void setStoresByAddressId(List<Store> storesByAddressId) {
        this.storesByAddressId = storesByAddressId;
    }
}
