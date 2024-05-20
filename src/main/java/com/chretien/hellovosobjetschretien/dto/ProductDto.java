package com.chretien.hellovosobjetschretien.dto;

import java.math.BigDecimal;

public class ProductDto {
    private Long id;
    private String name;
    private int stock;
    private String description;
    private BigDecimal price;
    private String categorie ;

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public ProductDto(Long id, String name, int stock, String description, BigDecimal price, String categorie) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.description = description;
        this.price = price;
        this.categorie = categorie;

    }
}
