package com.example.testsjava.util;

public class StringUtil {
    public static String repeate(String str, int times){
        if (times<0) throw new IllegalArgumentException("Negative times no allowed");
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
