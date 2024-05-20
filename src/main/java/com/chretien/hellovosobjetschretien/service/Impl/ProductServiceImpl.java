package com.chretien.hellovosobjetschretien.service.Impl;

import com.chretien.hellovosobjetschretien.repositories.ProductRepository;
import com.chretien.hellovosobjetschretien.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

}
