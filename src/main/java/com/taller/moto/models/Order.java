package com.taller.moto.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.taller.moto.models.Service;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderDate;

    private LocalDateTime departureDate;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Service> services ;

    @OneToOne(mappedBy = "order")
    private Mechanic mechanic;

    @OneToOne(mappedBy = "order")
    private Bike bike;

    @OneToOne(mappedBy = "order")
    private Invoice invoice;

    public Order() {
    }

    public Order(LocalDateTime orderDate, LocalDateTime departureDate, Set<Service> services, Mechanic mechanic, Bike bike, Invoice invoice) {
        this.orderDate = orderDate;
        this.departureDate = departureDate;
        this.services = services;
        this.mechanic = mechanic;
        this.bike = bike;
        this.invoice = invoice;
    }

    public Order(Long id, LocalDateTime orderDate, LocalDateTime departureDate, Set<Service> services, Mechanic mechanic, Bike bike, Invoice invoice) {
        this.id = id;
        this.orderDate = orderDate;
        this.departureDate = departureDate;
        this.services = services;
        this.mechanic = mechanic;
        this.bike = bike;
        this.invoice = invoice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
