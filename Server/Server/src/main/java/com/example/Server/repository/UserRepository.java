package com.example.Server.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.Server.model.user;

public interface UserRepository extends CrudRepository<user, Long> {
    user findByUsername(String username);

} 
