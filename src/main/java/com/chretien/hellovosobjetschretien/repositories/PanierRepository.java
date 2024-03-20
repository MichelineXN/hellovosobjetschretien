package com.chretien.hellovosobjetschretien.repositories;

import com.chretien.hellovosobjetschretien.domain.Panier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PanierRepository extends CrudRepository<Panier, Integer> {
    Panier findByName(String name);
}
