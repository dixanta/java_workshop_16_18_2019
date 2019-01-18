package com.cibt.day2.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHelper{
    public static String read(String file)throws IOException{
        BufferedReader reader=new BufferedReader(
            new FileReader(file)
        );
        String line="";
        StringBuilder content=new StringBuilder();
        while((line=reader.readLine())!=null){
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
}