package com.example.testsjava.util;

public class PasswordUtil {
    public enum SecurityLavel {
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLavel assertPassword(String password) {
        if(password.length() < 8){
            return SecurityLavel.WEAK;
        }
        if (password.matches("[a-zA-z]+")){
            return SecurityLavel.WEAK;
        }
        if (password.matches("[a-zA-z0-9]+")){
            return SecurityLavel.MEDIUM;
        }
        return SecurityLavel.STRONG;
    }
}
