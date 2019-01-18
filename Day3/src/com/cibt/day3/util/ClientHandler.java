package com.cibt.day3.util;

import java.util.ArrayList;
import java.util.List;


public class ClientHandler{
    private List<Client> clients;

    public ClientHandler(){
        clients=new ArrayList<>();
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public boolean removeClient(Client client){
        return clients.remove(client);
    }

    public List<Client> getClients(){
        return clients;
    }

    public Client findByUserName(String userName){
        for(Client c: clients){
            if(c.getUserName().equals(userName)){
                return c;
            }
        }
        return null;
    }
}