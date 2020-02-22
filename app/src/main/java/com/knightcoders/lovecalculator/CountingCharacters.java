package com.knightcoders.lovecalculator;

public class CountingCharacters {

    public String countChars(String str1, String str2){

        String combinedString = str1 + "loves" + str2;

        String strAllChars = "";
        String strCount = "";
        for (char c1: combinedString.toCharArray()){
            if (strAllChars.indexOf(c1) < 0){
                int count = 0;
                for (char c2: combinedString.toCharArray()){
                    if (c1 == c2 ){
                        count = count + 1;
                    }
                }
                strAllChars = strAllChars + c1;
                strCount = strCount + String.valueOf(count);
            }
        }
        return  strCount;
    }
}
