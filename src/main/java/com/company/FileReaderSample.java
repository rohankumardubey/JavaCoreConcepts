package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\rdubey\\OneDrive - MODEL N, INC\\Desktop\\project\\JavaPractise\\src\\com\\company\\ArrayListUsage.java");
        System.out.println("status:" + file.isFile());

        try (FileReader read = new FileReader(file);
             BufferedReader bf = new BufferedReader(read)) {

            System.out.println(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
