package com.taller.moto.models;

import jakarta.persistence.*;

@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String plateNumber;

    private String model;

    private String color;

    private String brand;

    @ManyToOne
    private Users users;

    @OneToOne
    private Order order;


    public Bike() {
    }

    public Bike(String plateNumber, String model, String color, String brand, Users user, Order orderB) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.users = user;
        this.order = orderB;
    }

    public Bike(Long id, String plateNumber, String model, String color, String brand, Users user, Order orderB) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.users = user;
        this.order = orderB;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users user) {
        this.users = user;
    }

    public Order getOrderB() {
        return order;
    }

    public void setOrderB(Order orderB) {
        this.order = orderB;
    }
}
