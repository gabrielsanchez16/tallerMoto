package com.taller.moto.models;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private String document;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Bike> bike;

    public Users() {
    }

    public Users(String document, String phoneNumber, String password, String email, String name) {
        this.document = document;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public Users(String name, String email, String password, String phoneNumber, String document, Set<Bike> bike) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.document = document;
        this.bike = bike;
    }

    public Users(Long id, String name, String email, String password, String phoneNumber, String document, Set<Bike> bike) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.document = document;
        this.bike = bike;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Set<Bike> getBike() {
        return bike;
    }

    public void setBike(Set<Bike> bike) {
        this.bike = bike;
    }
}
