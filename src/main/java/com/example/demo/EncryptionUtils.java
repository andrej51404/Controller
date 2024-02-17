package com.example.demo;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.server.ServerErrorException;

import java.security.SecureRandom;

public class EncryptionUtils {

    private static final int BCRYPT_WORKLOAD = 12;

    public static String generateSalt(){
        try{
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[16];
            random.nextBytes(salt);
            return BCrypt.gensalt(BCRYPT_WORKLOAD, random);
        }
        catch (Exception ex){
            throw new ServerErrorException("Yes", ex);
        }
    }
    public static String hashPassword(String password, String salt){
        return BCrypt.hashpw(password, salt);
    }

    public static boolean checkPassword(String enteredPassword, String storedPasswordHash){
        return BCrypt.checkpw(enteredPassword, storedPasswordHash);
    }
    

}
