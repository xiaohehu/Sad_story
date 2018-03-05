package com.example.xiaohehu.listviewtest;

/**
 * Created by xiaohehu on 3/4/18.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit (String name, int imageID){
        this.name = name;
        this.imageId = imageID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageId;
    }
}
