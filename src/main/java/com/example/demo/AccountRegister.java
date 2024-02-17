package com.example.demo;

public class AccountRegister {
    private String username;
    private String password;

    public AccountRegister(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String seasonedPassword) {
        this.password = seasonedPassword;
    }
}
