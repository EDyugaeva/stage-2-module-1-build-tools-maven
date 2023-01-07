package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        int n = Integer.parseInt(str);
        if (n > 0) {
            return true;
        }

        return false;
    }
}
