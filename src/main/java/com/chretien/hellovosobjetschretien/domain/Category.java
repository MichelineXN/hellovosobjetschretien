package com.chretien.hellovosobjetschretien.domain;


import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


   @Entity
        public class Category {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private Long id;

        @Column(nullable = false, unique = true)
        private String name;

        @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
        private Set<Product> products = new HashSet<>();

       private String description;
       private Date createdAt;
       private Date updatedAt;
       private Boolean isActive;

       public Category() {

       }

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

       public String getDescription() {
           return description;
       }

       public void setDescription(String description) {
           this.description = description;
       }

       public Date getCreatedAt() {
           return createdAt;
       }

       public void setCreatedAt(Date createdAt) {
           this.createdAt = createdAt;
       }

       public Date getUpdatedAt() {
           return updatedAt;
       }

       public void setUpdatedAt(Date updatedAt) {
           this.updatedAt = updatedAt;
       }

       public Boolean getActive() {
           return isActive;
       }

       public void setActive(Boolean active) {
           isActive = active;
       }

       public Set<Product> getProducts() {
           return products;
       }

       public void setProducts(Set<Product> products) {
           this.products = products;
       }

       public Category(Long id, String name, Set<Product> products, Long id1, String name1, String description, Date createdAt, Date updatedAt, Boolean isActive) {
           this.id = id;
           this.name = name;
           this.products = products;
           this.id = id1;
           this.name = name1;
           this.description = description;
           this.createdAt = createdAt;
           this.updatedAt = updatedAt;
           this.isActive = isActive;

       }


   }
