package com.couserjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couserjava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
