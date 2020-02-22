package com.knightcoders.lovecalculator;

public class FinalCal {

    CountingCharacters countingCharacters = new CountingCharacters();
    Shorting shorting = new Shorting();
    Editing editing = new Editing();


    public String calculate(String str1, String str2){
        String shortString = countingCharacters.countChars(str1,str2);
        String output = shortString;

        do{

            shortString = shorting.shortenNumber(shortString);
            if (shortString.length() == 2) {
                String emoji = String.valueOf(Character.toChars(editing.findEmoji(Integer.parseInt(shortString))));
                  output = shortString + "% " + emoji;
            }

        }while (shortString.length() > 2);

        return  output ;
    }

}
