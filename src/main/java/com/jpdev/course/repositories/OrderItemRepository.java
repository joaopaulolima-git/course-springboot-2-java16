package com.jpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
