package com.taller.moto.dto;

import java.util.List;

import com.taller.moto.models.Bike;

public class UserDto {

    Long id;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private String document;

    private List<Bike> bike;

    public UserDto() {
    }

    public UserDto(String document, String phoneNumber, String password, String email, String name) {
        this.document = document;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public UserDto(String name, String email, String password, String phoneNumber, String document, List<Bike> bike) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.document = document;
        this.bike = bike;
    }

    public UserDto(Long id, String name, String email, String password, String phoneNumber, String document,
            List<Bike> bike) {
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

    public List<Bike> getBike() {
        return bike;
    }

    public void setBike(List<Bike> bike) {
        this.bike = bike;
    }

}
