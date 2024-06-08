package com.taller.moto.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    public Service() {
    }

    public Service(String name, String description, BigDecimal price, Order order) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.order = order;
    }

    public Service(Long id, String name, String description, BigDecimal price, Order order) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.order = order;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    private String description;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;

}
