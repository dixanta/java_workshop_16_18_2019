package com.cibt.day3.command;

import java.io.IOException;

import com.cibt.day3.util.Broadcaster;
import com.cibt.day3.util.Client;

public class ListCommand extends ChatCommand {
    
    @Override
    public void execute(String[] tokens) throws IOException {
        StringBuilder content=new StringBuilder();
        content.append("============================================\r\n");
        for(Client c: handler.getClients()){
            if(c.equals(client)){
                content.append(c.getUserName()).append("(me)\r\n");
            }else{
                if(!c.hasBlocked(client)){
                    content.append(c.getUserName()).append("\r\n");
                }
                if(client.hasBlocked(c)){
                    content.append(c.getUserName()).append("[blocked]\r\n");
                }
            }
        }
        writer.println(content.toString());
    }
}