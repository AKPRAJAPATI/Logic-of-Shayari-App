package com.example.shayariapp.Application;

public class MainModel {
    String shayriTitle,shayriCount;
    int ShayariLogo;

    public MainModel(String shayriTitle, String shayriCount, int shayariLogo) {
        this.shayriTitle = shayriTitle;
        this.shayriCount = shayriCount;
        ShayariLogo = shayariLogo;
    }

    public String getShayriTitle() {
        return shayriTitle;
    }

    public void setShayriTitle(String shayriTitle) {
        this.shayriTitle = shayriTitle;
    }

    public String getShayriCount() {
        return shayriCount;
    }

    public void setShayriCount(String shayriCount) {
        this.shayriCount = shayriCount;
    }

    public int getShayariLogo() {
        return ShayariLogo;
    }

    public void setShayariLogo(int shayariLogo) {
        ShayariLogo = shayariLogo;
    }

}
