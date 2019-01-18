package com.cibt.day3.command;

import java.io.IOException;
import java.io.PrintStream;

import com.cibt.day3.util.Broadcaster;
import com.cibt.day3.util.Client;

public class UnblockCommand extends ChatCommand {
    
    @Override
    public void execute(String[] tokens) throws IOException {
        if(tokens.length>1){
            String userName=tokens[1];
            Client buddy = handler.findByUserName(userName);
            if(buddy!=null){
                client.unblock(buddy);

                PrintStream out=new PrintStream(buddy.getSocket().getOutputStream());
                out.println(client.getUserName() + " has logged in");
                writer.println("you have unblocked " + userName);
                
            }else{
                writer.println(userName + " not found");    
            }
        }else{
            writer.println("not enough parameters");
        }
        
    }
}