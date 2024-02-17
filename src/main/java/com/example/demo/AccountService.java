package com.example.demo;
import com.example.demo.AccountInterface;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private AccountInterface accountInterface;
    public AccountService(AccountInterface accountInterface){
        this.accountInterface = accountInterface;
    }

    public boolean register(String username, String password){
        String salt = EncryptionUtils.generateSalt();
        String seasonedPassword = EncryptionUtils.hashPassword(password, salt);
        long currentDate = (new Date().getTime())/1000;
        Account newAccount = new Account(username, seasonedPassword, salt, currentDate, currentDate, null, null);
        return this.accountInterface.registerInfo(newAccount);
    }

}


