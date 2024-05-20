package com.chretien.hellovosobjetschretien.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class ArticlePanier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int id_panier;
    private int id_Produit;
    private int quantite;
    private BigDecimal prix;
    private BigDecimal soustotal;
    private String nom;
}
