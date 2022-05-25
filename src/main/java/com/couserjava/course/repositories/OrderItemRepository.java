package com.couserjava.course.repositories;

import com.couserjava.course.entities.OrderItem;
import com.couserjava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
