package com.company.ClothingShop;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {



        ClothingStore pant = new PantInstance(SizeEnum.M, "green");
        ClothingStore hat = new HatInstance(SizeEnum.S, "pink");

        List<ClothingStore> items = new ArrayList<>();
        items.add(pant);
        items.add(hat);

        Map<String, ClothingStore> mapList = new HashMap<>();
        mapList.put("pant", pant);
        mapList.put("hat", hat);

        System.out.println("display using list");
        System.out.println("------------------");
        for (ClothingStore item : items) {
            DisplayDetails(item);
        }

        Set<String> keys = mapList.keySet();

        System.out.println("display using map");
        System.out.println("------------------");
        for (String key : keys) {
            ClothingStore item = mapList.get(key);
            DisplayDetails(item);
        }

    }

    public static void DisplayDetails(ClothingStore item) {

        String sample = item.getCloth();

        switch (sample) {
            case "shirt":
                item.setCloth(ClothingStore.SHIRT);
                item.setSize(SizeEnum.L);
                item.setColor("black");
                break;
            case "pant":
                item.setCloth(ClothingStore.PANT);
                item.setSize(SizeEnum.S);
                item.setColor("orange");
                break;
            case "hat":
                item.setCloth(ClothingStore.HAT);
                item.setSize(SizeEnum.S);
                item.setColor("purple");
                break;
        }
        System.out.println(item.getCloth());
        System.out.println(item.getColor());
        System.out.println(item.getSize());
        System.out.println("-------------------");
        System.out.println("-------------------");
    }
}
