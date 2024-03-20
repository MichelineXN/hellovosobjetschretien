package com.chretien.hellovosobjetschretien.repositories;

import com.chretien.hellovosobjetschretien.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    Order findByName(String name);

}
