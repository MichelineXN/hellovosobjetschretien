package com.chretien.hellovosobjetschretien.Controller;

import com.chretien.hellovosobjetschretien.domain.Product;
import com.chretien.hellovosobjetschretien.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class ProductController {
    @PostMapping("/api/vi/products")
    public ResponseEntity<Product>create(@RequestBody ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setStock(dto.getStock());
        return null;
    }
}
