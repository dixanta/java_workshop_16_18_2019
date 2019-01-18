package com.cibt.day1.utils;

public class StringHelper{

    public static boolean compare(String text,String pattern){
        text=text.toLowerCase();
        pattern=pattern.toLowerCase();
        int tlen=text.length();
        int plen=pattern.length();

        

        if(tlen==plen){
            if(text.charAt(0)==pattern.charAt(0) 
                    && text.charAt(tlen-1)==pattern.charAt(tlen-1)){
                int rev=tlen-2;
                boolean match=true;
                for(int i=1;i<tlen-2;i++){
                    if(text.charAt(i)!=pattern.charAt(i) 
                        || text.charAt(rev)!=pattern.charAt(rev)){
                        match=false;
                        break;
                    }else{
                        rev--;
                    }
                }
                return match;

            }
        }
        return false;

    }
}