package com.example.demo;

import com.example.demo.core.models.Accounts;
import com.example.demo.core.repo.AccountsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    @Autowired
    private AccountsRepo accountsRepo;

    public List<Accounts> getMyAccounts(Integer userId){
        return accountsRepo.findByUserId(userId);
    }
}
