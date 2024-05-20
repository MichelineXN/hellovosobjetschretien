package com.chretien.hellovosobjetschretien.repositories;


import com.chretien.hellovosobjetschretien.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}
