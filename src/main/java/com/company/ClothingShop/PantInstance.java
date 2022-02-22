package com.company.ClothingShop;

public class PantInstance extends ClothingStore {

    // Extending `ClothingStore` and overriding the `getType` method.
    PantInstance(SizeEnum size, String color) {
        super(ClothingStore.PANT, size, color);
    }

}
