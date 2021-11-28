package com.company.ClothingShop;

public enum SizeEnum {
    S("small"), M("medium"), L("large");

    private final String description;

    SizeEnum(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}
