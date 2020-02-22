package com.knightcoders.lovecalculator;

public class Shorting {

    String shortenNumber(String str) {
        String shortenString = "";
        if (str.length() >= 2) {
            int int1 = Integer.parseInt(String.valueOf(str.toCharArray()[0]));
            int int2 = Integer.parseInt(String.valueOf(str.toCharArray()[str.length() - 1]));
            shortenString = String.valueOf(int1 + int2) + shortenNumber(str.substring(1, str.length() - 1));
        } else {
            return str;
        }

        return shortenString;
    }

}
