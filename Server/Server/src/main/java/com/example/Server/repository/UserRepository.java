package com.example.Server.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.Server.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
} 
