package com.cibt.day3.command;

import java.io.IOException;
import java.io.PrintStream;

import com.cibt.day3.util.Broadcaster;
import com.cibt.day3.util.Client;

public class PMCommand extends ChatCommand {

    @Override
    public void execute(String[] tokens) throws IOException {
        if (tokens.length > 2) {
            String userName = tokens[1];
            Client buddy = handler.findByUserName(userName);
            if (buddy != null) {
                if (!buddy.equals(client)) {
                    if (!buddy.hasBlocked(client)) {
                        PrintStream out = new PrintStream(buddy.getSocket().getOutputStream());
                        out.println("[PM from " + client.getUserName() + "]>" + tokens[2]);
                        String autoReply = buddy.getAutoReply();
                        if (autoReply != null && !autoReply.isEmpty()) {
                            writer.println("[Auto Reply from " + userName + "]>" + autoReply);
                        }
                    }else{
                        writer.println("user not available");
                    }
                } else {
                    writer.println("How dare you send message to yourself");
                }
            } else {
                writer.println(userName + " not found");
            }
        } else {
            writer.println("Not enough parameters");
        }
    }
}