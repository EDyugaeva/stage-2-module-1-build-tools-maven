package com.epam.demo;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
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
                return false;
            }

            float n = NumberUtils.createFloat(s);
            if (n > 0) {
                result = true;
            } else return false;
        }

        //magic happens here
        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("");
        list.add(" ");
//        list.add("-1");
//        list.add("-1.5");
        list.add("2");
        list.add("5");
        System.out.println(Utils.isAllPositiveNumbers(list));


    }
}