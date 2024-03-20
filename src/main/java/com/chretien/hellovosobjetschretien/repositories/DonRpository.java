package com.chretien.hellovosobjetschretien.repositories;


import com.chretien.hellovosobjetschretien.domain.Don;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonRpository extends CrudRepository<Don, Integer> {
    Don findByName(String name);

}
