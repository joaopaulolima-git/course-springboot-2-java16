package com.jpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
