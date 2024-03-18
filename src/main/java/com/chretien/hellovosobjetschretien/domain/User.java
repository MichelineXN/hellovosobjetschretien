package com.chretien.hellovosobjetschretien.domain;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String adresse;
    @Column(nullable = false)
    private String dateInscription;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String role;


    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Order> commandes = new HashSet<>();

    @ManyToOne
    private Panier panier; // Cette relation reste inchangée car elle ne représente qu'un seul élément

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Order> getCommandes() {
        return commandes;
    }

    public void setCommandes(Set<Order> commandes) {
        this.commandes = commandes;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public User(Long id, String username, String email, String password, String adresse, String dateInscription,
                String phone, String role, Set<Role> roles, Set<Order> commandes, Panier panier) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.adresse = adresse;
        this.dateInscription = dateInscription;
        this.phone = phone;
        this.role = role;
        this.roles = roles;
        this.commandes = commandes;
        this.panier = panier;
    }

    public User(Long id) {
        this.id = id;




    }
}