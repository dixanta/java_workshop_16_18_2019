package com.cibt.day3.util;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client{
    private String userName;
    private Socket socket;
    private String autoReply=null;
    private List<Client> blockList=new ArrayList<>();

    public Client(String userName,Socket socket){
        this.socket=socket;
        this.userName=userName;
    }

    public String getUserName(){
        return userName;
    }

    public Socket getSocket(){
        return socket;
    }

    public void setAutoReply(String autoReply){
        this.autoReply=autoReply;
    }

    public String getAutoReply(){
        return autoReply;
    }

    public boolean hasBlocked(Client client){
        for(Client c: blockList){
            if(c.equals(client)){
                return true;
            }
        }
        return false;
    }
    public void block(Client client){
        if(!hasBlocked(client))
            blockList.add(client);
    }

    public void unblock(Client client){
        if(hasBlocked(client))
            blockList.remove(client);
    }
}