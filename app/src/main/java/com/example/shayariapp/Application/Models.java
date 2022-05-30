package com.example.shayariapp.Application;

public class Models {
    int imageResource;
    String shayariname;
    int BACKGROUND;

    public Models(int imageResource, String shayariname, int BACKGROUND) {
        this.imageResource = imageResource;
        this.shayariname = shayariname;
        this.BACKGROUND = BACKGROUND;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getShayariname() {
        return shayariname;
    }

    public void setShayariname(String shayariname) {
        this.shayariname = shayariname;
    }

    public int getBACKGROUND() {
        return BACKGROUND;
    }

    public void setBACKGROUND(int BACKGROUND) {
        this.BACKGROUND = BACKGROUND;
    }
}
