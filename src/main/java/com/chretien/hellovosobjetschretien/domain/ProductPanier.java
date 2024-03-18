package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.*;


@Entity
public class ProductPanier {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)


   private Long id;
   private int quantity; // Quantité du produit dans le panier

    private double pricePerUnit; // Prix par unité au moment de l'ajout au panier

    private String customizationOptions; // Personnalisation pour le produit
    private double discount;



    @ManyToOne
    @JoinColumn(name = "panier_id", nullable = false)
    private Panier panier;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    // Constructeurs,


    public ProductPanier(Long id, int quantity, double pricePerUnit, String customizationOptions, double discount, Panier panier, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.customizationOptions = customizationOptions;
        this.discount = discount;
        this.panier = panier;
        this.product = product;
    }

    public ProductPanier() {
    }

    // Getters et Setters  // Important pour la gestion des collections dans Hibernate/JPA


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getCustomizationOptions() {
        return customizationOptions;
    }

    public void setCustomizationOptions(String customizationOptions) {
        this.customizationOptions = customizationOptions;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductPanier that = (ProductPanier) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    // Méthodes pour la gestion de la quantité et des décrémentations

    // Cette méthode peut être appelée pour mettre à jour la quantité d'un produit dans le panier
    // et ajuster le stock du produit correspondant.
    // Note: La logique de décrémentation du stock pourrait être gérée ici ou au niveau du service aussi.
}

