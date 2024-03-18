package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;



    //Constructeur
    public OrderStatus(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public OrderStatus() {


    }

    public OrderStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Méthode pour afficher l'état actuel, peut être utilisée dans des logs ou des réponses d'API
    public void displayStatus() {
        System.out.println("Current order status: " + this.status);
    }
}
