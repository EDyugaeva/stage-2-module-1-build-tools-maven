package com.epam.demo;


import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.isEmpty()) {
            return false;
        }

        boolean result = true;
        for (String s :
                args) {
            if (s.isEmpty() || s.equals(" ")) {
                continue;
            }

            float n = Float.parseFloat(s);
            if (n > 0) {
                result = true;
            } else return false;
        }

        //magic happens here
        return result;
    }
}