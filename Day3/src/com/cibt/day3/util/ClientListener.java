package com.cibt.day3.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import com.cibt.day3.command.ChatCommand;
import com.cibt.day3.command.ChatCommandFactory;

public class ClientListener extends Thread {
    private Client client;
    private Socket socket;
    private PrintStream writer;
    private BufferedReader reader;
    private ClientHandler handler;
    public ClientListener(Socket socket,ClientHandler handler) throws IOException{
        this.socket = socket;
        this.handler=handler;
        writer = new PrintStream(socket.getOutputStream());
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {
        try {
            login();
            while(true){
                writer.println(">");
                String line=reader.readLine();
                String[] tokens=line.split(";;");
                ChatCommand command=ChatCommandFactory.get(tokens[0]);
                
                if(command!=null){
                    command.init(client, handler, writer);
                    command.execute(tokens);
                }else{
                    String msg=client.getUserName() + " says>" +line;
                    Broadcaster.send(client, msg, handler.getClients());
                }
                
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }   
    }

    private void login() throws IOException {
        writer.println("hello from CIBT Server");
        writer.println("User Name:");
        String userName = reader.readLine();
        client =new Client(userName, socket);
        handler.addClient(client);
        System.out.println(userName);
        writer.println("Hello " + userName);
        Broadcaster.send(client,client.getUserName() + " has logged in", handler.getClients());

    }
}