package com.jpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
