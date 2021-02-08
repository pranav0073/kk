package com.example.demo.core.repo;

import com.example.demo.core.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsRepo  extends JpaRepository<Accounts,Integer> {

    List<Accounts> findByUserId(Integer userId);
}
