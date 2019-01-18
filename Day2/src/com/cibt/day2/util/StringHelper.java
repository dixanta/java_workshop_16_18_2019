package com.cibt.day2.util;

public class StringHelper {

    public static int count(String text, String pattern) {
        text = text.toLowerCase();
        pattern = pattern.toLowerCase();
        int tlen = text.length();
        int plen = pattern.length();

        int i = 0, j = 0, index = 0;
        int counter = 0;
        while (i <= (tlen - plen)) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == plen) {
                    counter++;
                    j = 0;
                    
                }
            } else {
                i = ++index;
                j = 0;
            }
        }
        return counter;
    }
}