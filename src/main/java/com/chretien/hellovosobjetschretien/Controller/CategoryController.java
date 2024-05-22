package com.chretien.hellovosobjetschretien.Controller;

import com.chretien.hellovosobjetschretien.domain.Category;
import com.chretien.hellovosobjetschretien.dto.CategoryDto;
import com.chretien.hellovosobjetschretien.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryController {


    @PostMapping("/api/v1/categorys")
    public  ResponseEntity<Category> create(@RequestBody CategoryDto dto) {
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        return ResponseEntity.status(201).body(category); // Code 201 pour dire que ça a été crée
    }

}
