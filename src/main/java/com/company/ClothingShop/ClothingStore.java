package com.company.ClothingShop;

public class ClothingStore {

    public static final String PANT = "pant";
    public static final String SHIRT = "shirt";
    public static final String HAT = "hat";

    private String cloth;
    private SizeEnum size;
    private String color;

    ClothingStore(String cloth, SizeEnum size, String color) {
        this.cloth = cloth;
        this.size = size;
        this.color = color;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCloth() {
        return this.cloth;
    }

    public SizeEnum getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }
}
