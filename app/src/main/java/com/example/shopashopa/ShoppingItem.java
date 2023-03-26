package com.example.shopashopa;

public class ShoppingItem {
    private String name;
    private boolean purchased;

    public ShoppingItem(String name) {
        this.name = name;
        purchased = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }
}
