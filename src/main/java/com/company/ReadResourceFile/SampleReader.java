package com.company.ReadResourceFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SampleReader {
    public static void main(String[] args) throws IOException {
        SampleReader reader = new SampleReader();
        InputStream stream=reader.InputStreamRead("sample.txt");
        reader.ReadStream(stream);

    }

    public InputStream InputStreamRead(String filename){
        InputStream is =this.getClass().getClassLoader().getResourceAsStream(filename);
        return is;
    }

    public void ReadStream(InputStream is) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
