package com.cibt.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import com.cibt.day2.util.FileHelper;
import com.cibt.day2.util.LinkedList;
import com.cibt.day2.util.StringHelper;

public class Program {
    public static void main(String[] args) {
        
        LinkedList<Double> list=new LinkedList<>();
        list.addLast(23.4);
        list.addLast(35.6);
        

        list.print();
        /*try{
       System.out.println(new Date());
       String content=FileHelper.read("data1.txt");
       System.out.println(new Date());
       System.out.println(StringHelper.count(content,"node"));
       System.out.println(new Date());
        }catch(IOException ioe){

        }*/
    }
}