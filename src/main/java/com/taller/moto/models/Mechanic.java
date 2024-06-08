package com.taller.moto.models;

import jakarta.persistence.*;

@Entity
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private String document;
    @OneToOne(fetch = FetchType.LAZY)
    private Order order;


    public Mechanic(String name, String email, String password, String phoneNumber, String document, Order orderM) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.document = document;
        this.order = orderM;
    }

    public Mechanic() {
    }

    public Mechanic(Long id, String name, String email, String password, String phoneNumber, String document, Order orderM) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.document = document;
        this.order = orderM;
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

    public Order getOrderM() {
        return order;
    }

    public void setOrderM(Order orderM) {
        this.order = orderM;
    }




}
