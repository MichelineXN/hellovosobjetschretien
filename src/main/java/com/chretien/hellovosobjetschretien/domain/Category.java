package com.chretien.hellovosobjetschretien.domain;


import jakarta.persistence.*;
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

       public Set<Product> getProducts() {
           return products;
       }

       public void setProducts(Set<Product> products) {
           this.products = products;
       }

       public Category(Long id, String name, Set<Product> products) {
           this.id = id;
           this.name = name;
           this.products = products;


       }
   }
