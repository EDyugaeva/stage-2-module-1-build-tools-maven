package com.epam.demo;


import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean result = true;
        for (String s :
                args) {
            int n = Integer.parseInt(s);
            if (n > 0) {
                result = true;
            } else return false;
        }

        //magic happens here
        return result;
    }
}