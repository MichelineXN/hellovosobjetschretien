package com.chretien.hellovosobjetschretien.Controller;

import com.chretien.hellovosobjetschretien.domain.Product;
import com.chretien.hellovosobjetschretien.dto.ProductDto;
import com.chretien.hellovosobjetschretien.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductService productService;
    @PostMapping("/api/vi/products")
    public ResponseEntity<Product>create(@RequestBody ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setStock(dto.getStock());
        return ResponseEntity.status(201).body(product); // Code 201 pour dire ça a été crée
    }
}
