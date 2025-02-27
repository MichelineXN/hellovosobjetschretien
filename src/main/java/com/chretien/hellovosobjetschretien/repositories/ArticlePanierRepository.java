package com.chretien.hellovosobjetschretien.repositories;

import com.chretien.hellovosobjetschretien.domain.ArticlePanier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlePanierRepository extends CrudRepository<ArticlePanier, Integer> {
    ArticlePanier findByName(String name);
}
