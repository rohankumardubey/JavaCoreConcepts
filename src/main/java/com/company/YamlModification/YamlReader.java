package com.company.YamlModification;

import java.io.File;
import java.io.IOException;

public class YamlReader {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\rdubey\\OneDrive - MODEL N, INC\\Desktop\\JavaCoreConcepts\\src\\main\\java\\com\\company\\YamlModification\\user-modified.yaml";
        File f1 = new File("C:\\Users\\rdubey\\OneDrive - MODEL N, INC\\Desktop\\JavaCoreConcepts\\src\\main\\java\\com\\company\\");
        File f2 = new File(f1,"YamlModification\\");
        File f3 = new File(f2,"user-modified.yaml");
        YamlEngine engine = new YamlEngine();
        engine.parseYaml(String.valueOf(f3),podMemory.LARGE);

    }

    public enum podMemory{
        SMALL,
        MEDIUM,
        LARGE
    }

}
