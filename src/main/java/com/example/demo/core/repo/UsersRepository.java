package com.example.demo.core.repo;


import com.example.demo.core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {


    Optional<User> findByFirstName(String firstname);
}