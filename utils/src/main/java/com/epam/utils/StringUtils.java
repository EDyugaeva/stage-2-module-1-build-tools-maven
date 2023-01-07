package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        if (str.isEmpty() || str.equals(" ")||str == null) {
            return false;
        }

        float n = Float.parseFloat(str);
        if (n > 0) {
            return true;
        }

        return false;
    }
}
