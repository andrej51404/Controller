package com.example.demo;
import java.util.Optional;

public interface AccountInterface {
   boolean registerInfo(Account account);
   Optional<Account> accountInfo(String username);
   boolean changeLogin(Account account);
   boolean deleteAccount(Account account);

}
