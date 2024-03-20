package com.chretien.hellovosobjetschretien.repositories;

import com.chretien.hellovosobjetschretien.domain.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetRepository extends CrudRepository<Pet, Integer> {
    Pet findByName(String name);
}
