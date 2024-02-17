package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/register")
    public String register(@RequestBody AccountRegister accountRequest) {
        boolean registered = accountService.register(accountRequest.getUsername(), accountRequest.getPassword());
        if (registered) {
            return "You have successfully registered.";
        } else {
            return "There was an error registering your account.";
        }
    }


//    @PostMapping("/login")
   // public String login(@RequestBody Account accountRequest){
       // Account account = new Account();
       // account.setUsername(accountRequest.getUsername());
       // if (account.checkPassword(accountRequest.getPassword())){
        //    return "Login successful";
     //   } else{
//return "Wrong Username/Password";
        
    }








