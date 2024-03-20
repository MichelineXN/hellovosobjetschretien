package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.*;

public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type; // Par exemple, casquette, chapeau, bonnets.....

    @ManyToOne
    @JoinColumn(name = "owner_id") // Clé étrangère dans la table Pet pointant vers Owner
    private Owner owner;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Pet(Long id, String name, String type, Owner owner) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.owner = owner;


    }
}
