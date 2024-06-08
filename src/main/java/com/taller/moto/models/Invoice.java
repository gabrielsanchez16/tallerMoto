package com.taller.moto.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;

    @OneToOne
    private Order order;

    public Invoice() {

    }

    public BigDecimal getPrice() {
        return price;
    }

    public Invoice(Long id, BigDecimal price, Order order) {
        this.id = id;
        this.price = price;
        this.order = order;
    }

    public Invoice(BigDecimal price, Order order) {
        this.price = price;
        this.order = order;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
