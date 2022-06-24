package com.serenity.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveData {
    protected String path;

    public SaveData(String path){
        this.path=path;
    }

    public void writeFile(String txt){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            byte[] str = txt.getBytes();
            fileOutputStream.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readFile(){

        String file ="";

        try {
            file = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;

    }

    public static SaveData getInstance(String path){
        return new SaveData(path);
    }
}
