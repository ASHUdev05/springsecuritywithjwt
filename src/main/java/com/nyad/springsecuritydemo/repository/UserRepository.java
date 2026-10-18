package com.nyad.springsecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyad.springsecuritydemo.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
