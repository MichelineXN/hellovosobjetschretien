package com.chretien.hellovosobjetschretien.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Owner extends CrudRepository<Owner, Integer> {
    Owner findByName(String name);
}
