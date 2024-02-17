package com.example.demo;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository implements AccountInterface{

    public boolean registerInfo(Account account){
        return true;
    }
    public Optional<Account> accountInfo(String username){
        return Optional.empty();
    }
    public boolean changeLogin(Account account){
        return true;
    }
    public boolean deleteAccount(Account account){
        return true;
    }


}


