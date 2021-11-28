package com.company;

import java.io.*;

public class SerializeDeserializeFile implements Serializable {
    private final String name;
    private final int id;

    SerializeDeserializeFile(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        SerializeDeserializeFile message = new SerializeDeserializeFile(1,"object1");
        String filename="sample.txt";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream objOut = new ObjectOutputStream(file);

            objOut.writeObject(message);
            file.close();
            objOut.close();
            System.out.println("serialize has been completed");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            SerializeDeserializeFile object =(SerializeDeserializeFile)objIn.readObject();
            System.out.println(object.id);
            System.out.println(object.name);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


