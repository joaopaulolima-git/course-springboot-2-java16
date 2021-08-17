package com.jpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
