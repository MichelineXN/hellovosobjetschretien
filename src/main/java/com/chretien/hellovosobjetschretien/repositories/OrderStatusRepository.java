package com.chretien.hellovosobjetschretien.repositories;

import com.chretien.hellovosobjetschretien.domain.OrderStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatus, Integer> {
    OrderStatus findByName(String name);
}
