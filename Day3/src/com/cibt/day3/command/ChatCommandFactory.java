package com.cibt.day3.command;

public class ChatCommandFactory{
    public static ChatCommand get(String param){
        switch(param.toLowerCase()){
            case "exit":
                return new ExitCommand();
            case "list":
                return new ListCommand();
            case "pm":
                return new PMCommand();
            case "autoreply":
                return new AutoReplyCommand();
            case "block":
                return new BlockCommand();
            case "unblock":
                return new UnblockCommand();
            case "dir":
                return new DirCommand();
            default:
                return null;
        }
    }
}