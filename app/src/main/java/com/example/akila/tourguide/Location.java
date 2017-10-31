package com.example.akila.tourguide;

/**
 * Contains the location suggested by the app
 */

public class Location {
    private String name;
    private String address;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private  static final int NO_IMAGE_PROVIDED = -1;

    public Location(String n, String a, int imageId){
        name = n;
        address = a;
        imageResourceId = imageId;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
