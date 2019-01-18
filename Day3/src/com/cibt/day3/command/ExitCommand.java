package com.cibt.day3.command;

import java.io.IOException;

import com.cibt.day3.util.Broadcaster;

public class ExitCommand extends ChatCommand {
    
    @Override
    public void execute(String[] tokens) throws IOException {
        Broadcaster.send(client, client.getUserName() + " has logged out", handler.getClients());
        client.getSocket().close();
        handler.removeClient(client);
    }
}