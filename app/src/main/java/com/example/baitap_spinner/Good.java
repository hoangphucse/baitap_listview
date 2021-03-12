package com.example.baitap_spinner;

public class Good {
    private String name;
    private String shopName;
    private int imageGood;

    public Good(String name, String shopName, int imageGood) {
        this.name = name;
        this.shopName = shopName;
        this.imageGood = imageGood;
    }

    public String getName() {
        return name;
    }

    public String getShopName() {
        return shopName;
    }

    public int getImageGood() {
        return imageGood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setImageGood(int imageGood) {
        this.imageGood = imageGood;
    }
}
