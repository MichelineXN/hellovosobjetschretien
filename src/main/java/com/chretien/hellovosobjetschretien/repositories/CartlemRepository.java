package com.chretien.hellovosobjetschretien.repositories;

import com.chretien.hellovosobjetschretien.domain.CartItem;
import com.chretien.hellovosobjetschretien.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CartlemRepository extends CrudRepository<CartItem, Integer> {
    Category findByName(String name);
}