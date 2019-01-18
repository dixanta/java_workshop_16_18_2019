package com.cibt.day3.command;

import java.io.IOException;
import java.io.PrintStream;

import com.cibt.day3.util.Client;
import com.cibt.day3.util.ClientHandler;

public abstract class ChatCommand{
    
    protected Client client;
    protected ClientHandler handler;
    protected PrintStream writer;

    public void init(Client client,ClientHandler handler,PrintStream writer){
        this.client=client;
        this.handler=handler;
        this.writer=writer;        
    }
    public abstract void execute(String[] tokens)throws IOException;
}