package com.example.shop_online_be.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class EncrytedPasswordUtils {

    // Encryte Password with BCryptPasswordEncoder
    public String encrytePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public static void main(String[] args) {
//        String password = "123456a@";
//        String encrytedPassword = new EncrytedPasswordUtils().encrytePassword(password);
//        System.out.println(encrytedPassword);
//        System.out.println("Encryted Password: " + encrytedPassword);
    }

}
