package com.cibt.day3.util;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Broadcaster{
    public static void send(Client client,String message,List<Client> clients)
                throws IOException{
        for(Client c: clients){
            if(!c.equals(client)){
                PrintStream out=new PrintStream(c.getSocket().getOutputStream());
                out.println(message);
            }
        }
    }
}