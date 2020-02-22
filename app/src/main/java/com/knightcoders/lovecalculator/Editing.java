package com.knightcoders.lovecalculator;

public class Editing {

    public int findEmoji(int r){

        int o;

        if(r >= 80)
            o = 0x1F60D;

        else if(r>=60 && r<80)
            o = 0x1F60B;

        else  if(r>=40 && r<60)
            o = 0x1F60A;

        else
            o = 0x1F616;

        return o;

    }
}
