package com.chretien.hellovosobjetschretien.service.Impl;

import com.chretien.hellovosobjetschretien.domain.Product;
import com.chretien.hellovosobjetschretien.repositories.ProductRepository;
import com.chretien.hellovosobjetschretien.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product add(Product product) {
        return null;
    }
}
