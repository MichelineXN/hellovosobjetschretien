package com.chretien.hellovosobjetschretien.repositories;

import com.chretien.hellovosobjetschretien.domain.ProductPanier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductPanierRepository extends CrudRepository<ProductPanier, Integer> {
    ProductPanier findByName(String name);
}
