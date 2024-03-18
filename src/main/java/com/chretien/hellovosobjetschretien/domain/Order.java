package com.chretien.hellovosobjetschretien.domain;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;  // Informations sur le client
    private String customerEmail;

    private String address; // Informations de livraison
    private String phoneNumber;
    private String status;  // Statut de la commande,
    private String localDateTime;



    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<OrderItem> items = new HashSet<>();
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;

    // Constructeurs,

    public Order(Long id, String customerName, String customerEmail, String address, String phoneNumber,
                 String status, String localDateTime, Set<OrderItem> items, LocalDateTime orderDate, LocalDateTime deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.localDateTime = localDateTime;
        this.items = items;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public Order() {

    }


    // Gtters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public void setItems(Set<OrderItem> items) {
        this.items = items;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void addItem(OrderItem item) {
        items.add(item);
        item.setOrder(this);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
        item.setOrder(null);
    }
}

