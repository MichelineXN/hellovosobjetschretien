package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;


@Entity
public class Don {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private double amount; // Montant du don
    private String donorName; // Nom du donateur
    private LocalDateTime donationTime; // Moment du don


    //CONSTRUCTEUR

    public Don(Long id, double amount, String donorName, LocalDateTime donationTime) {
        this.id = id;
        this.amount = amount;
        this.donorName = donorName;
        this.donationTime = donationTime;
    }

    public Don() {

    }

    //GETTER SETTER

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public LocalDateTime getDonationTime() {
        return donationTime;
    }

    public void setDonationTime(LocalDateTime donationTime) {
        this.donationTime = donationTime;
    }
}
