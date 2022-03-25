package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        BufferedReader objReader1 = null;
        BufferedReader objReader2 = null;
        try {
            String strCurrentLine1;
            String strCurrentLine2;

            objReader1 = new BufferedReader(new FileReader("C:\\\\Modeln\\\\modn-sapljo-api\\\\examples\\\\nifiutils-worker\\\\src\\\\main\\\\java\\\\com\\\\modeln\\\\workers\\\\example\\\\nifi\\\\client.crt"));
            objReader2 = new BufferedReader(new FileReader("C:\\Modeln\\modn-sapljo-api\\examples\\nifiutils-worker\\src\\main\\java\\com\\modeln\\workers\\example\\nifi\\client.key"));

            while ((strCurrentLine1 = objReader1.readLine()) != null) {

                System.out.println(strCurrentLine1);
            }

            while ((strCurrentLine2 = objReader2.readLine()) != null) {

                System.out.println(strCurrentLine2);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader1 != null)
                    objReader1.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            try {
                if (objReader2 != null)
                    objReader2.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
