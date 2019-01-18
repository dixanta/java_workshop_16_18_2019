package com.cibt.day3.command;

import java.io.IOException;

import com.cibt.day3.util.Broadcaster;
import com.cibt.day3.util.Client;

public class AutoReplyCommand extends ChatCommand {
    
    @Override
    public void execute(String[] tokens) throws IOException {
        if(tokens.length>1){
            client.setAutoReply(tokens[1]);
            writer.println("Your auto reply message has been recoreded");
        }else{
            writer.println("not enough parameters");
        }
    }
}