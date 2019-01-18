package com.cibt.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.cibt.day3.util.ClientHandler;
import com.cibt.day3.util.ClientListener;

public class Program{

    public static void main(String[] args) {
        int port = 9000;
        System.out.println("Server is running at " + port);

        try {
            ServerSocket server=new ServerSocket(port);

            ClientHandler handler=new ClientHandler();
            while (true) {

                Socket socket=server.accept();
                System.out.println("connect request from "+
                socket.getInetAddress().getHostAddress());
                new ClientListener(socket,handler).start();
                

            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
}