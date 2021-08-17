package com.jpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
