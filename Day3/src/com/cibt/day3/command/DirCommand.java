package com.cibt.day3.command;

import java.io.File;
import java.io.IOException;

import com.cibt.day3.util.Broadcaster;
import com.cibt.day3.util.Client;

public class DirCommand extends ChatCommand {
    
    @Override
    public void execute(String[] tokens) throws IOException {
        StringBuilder content=new StringBuilder();
        content.append("============================================\r\n");
        String path=".";
        if(tokens.length>1){
            path=tokens[1];
        }
        File file=new File(path);
        for(File f:file.listFiles()){
            content.append(f.getPath() + " (" + (f.isDirectory()?"Dir":"File") +")\r\n");
        }
        writer.println(content.toString());
    }
}