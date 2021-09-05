package com.curtin.game.pracgrader.model;

public class Flag {
    private String countryName;
    private int imageId;

    public Flag(String countryName, int imageId) {
        this.countryName = countryName;
        this.imageId = imageId;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public int getImageId() {
        return this.imageId;
    }
}
