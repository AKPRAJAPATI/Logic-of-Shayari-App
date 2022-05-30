package com.example.shayariapp.Application;

public class ModelDetail {

    String shayariya,whichTipeOfShayary;
    int backgroundImage;

    public ModelDetail(String shayariya, String whichTipeOfShayary, int backgroundImage) {
        this.shayariya = shayariya;
        this.whichTipeOfShayary = whichTipeOfShayary;
        this.backgroundImage = backgroundImage;
    }

    public String getShayariya() {
        return shayariya;
    }

    public void setShayariya(String shayariya) {
        this.shayariya = shayariya;
    }

    public String getWhichTipeOfShayary() {
        return whichTipeOfShayary;
    }

    public void setWhichTipeOfShayary(String whichTipeOfShayary) {
        this.whichTipeOfShayary = whichTipeOfShayary;
    }

    public int getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(int backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
}
