package com.epam.demo;


import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.isEmpty()) {
            return false;
        }

        boolean result = true;
        for (String s :
                args) {
            if (!NumberUtils.isCreatable(s)) {
                continue;
            }

            float n = NumberUtils.createFloat(s);
            if (n > 0) {
                result = true;
            } else return false;
        }

        //magic happens here
        return result;
    }
}