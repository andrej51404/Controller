package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "salt", nullable = false)
    private String salt;

    @Column(name = "creation_date", nullable = false)
    private long creationDate;

    @Column(name = "last_updated", nullable = false)
    private long lastUpdated;

    @Column(name = "last_login")
    private Long lastLogin;

    @Column(name = "last_login_ip")
    private String lastLoginIp;


    public Account(String username, String password, String salt, long creationDate, long lastUpdated, Long lastLogin, String lastLoginIp){
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.creationDate = creationDate;
        this.lastUpdated = lastUpdated;
        this.lastLogin = lastLogin;
        this.lastLoginIp = lastLoginIp;
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

    public String getSalt(){
        return salt;
    }

    public void setSalt(String salt){
        this.salt = salt;
    }

    public long getcreationDate(){
        return creationDate;
    }

    public long getlastUpdated(){
        return lastUpdated;
    }

    public long getlastLogin(){
        return lastLogin;
    }

    public String getlastLoginIp(){
        return lastLoginIp;
    }

    public void setcreationDate(long creationDate){
        this.creationDate = creationDate;
    }

    public void setlastUpdated(long lastUpdated){
        this.lastUpdated = lastUpdated;
    }

    public void setlastLogin(Long lastLogin){
        this.lastLogin = lastLogin;
    }

    public void setlastLoginIp(String lastLoginIp){
        this.lastLoginIp = lastLoginIp;
    }

}