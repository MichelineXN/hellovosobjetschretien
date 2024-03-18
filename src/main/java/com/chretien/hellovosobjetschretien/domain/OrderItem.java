package com.chretien.hellovosobjetschretien.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;



@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product; // Le produit commandé

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order; // La commande associée à cet article

    private int quantity; // La quantité commandée du produit

    private BigDecimal price; // Le prix du produit au moment de la commande

    public OrderItem() {

    }

    // Calculate subtotal for the order item
    public BigDecimal getSubtotal() {
        return price.multiply(new BigDecimal(quantity));
    }

    public OrderItem(Long id, Product product, Order order, int quantity, BigDecimal price) {
        this.id = id;
        this.product = product;
        this.order = order;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Getters and setters


}
