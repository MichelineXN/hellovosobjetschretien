package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.chretien.hellovosobjetschretien.domain.Pet;


@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String ownername;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private LocalDate registrationDate;
    private int petCount = 0;  //// Initialisé à 0 // Pour suivre le nombre de pets de façon explicite
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pet> pets = new ArrayList<>();

    public Owner() {

    }

    public Owner(Long id, String ownername, String name, String address, String email, String phoneNumber, LocalDate registrationDate, int petCount, List<Pet> pets) {
        this.id = id;
        this.ownername = ownername;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.registrationDate = registrationDate;
        this.petCount = petCount;
        this.pets = pets;
    }

    public void addPet(Pet pet) {
        if (pet != null) {
            pets.add(pet);
            pet.setOwner(this);
            this.petCount++; // Incrémenter le compteur de pets
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getPetCount() {
        return petCount;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
