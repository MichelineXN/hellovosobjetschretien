package com.chretien.hellovosobjetschretien.repositories;


import com.chretien.hellovosobjetschretien.domain.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {
     OrderItem findByName(String name);
}
