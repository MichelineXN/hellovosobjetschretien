package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.*;


@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product; // Le produit associé à cet item du panier

    private int quantity; // La quantité de ce produit que l'utilisateur souhaite acheter

    private double unitPrice;  // Prix unitaire du produit au moment de l'ajout au panier
    // Utile si le prix du produit change sur le site après l'ajout au panier
    private String customizationOptions;  // Attributs pour les options de personnalisation, si applicables

    private double discount; // Pour gérer les remises spécifiques à cet item


    //Constructeur
    public CartItem(Long id, String product, int quantity, double unitPrice, String customizationOptions, double discount) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.customizationOptions = customizationOptions;
        this.discount = discount;
    }

    public CartItem() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
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

    // Calculer le sous-total pour cet item, en prenant en compte la remise
    public double getSubtotal() {
        return (unitPrice - discount) * quantity;


    }
}

