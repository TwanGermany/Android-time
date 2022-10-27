package com.example.midtermtest;

public class Landmark {
    private int resourceId;
    private String name;
    private String description;
    private int Rating;

    public Landmark(int resourceId, String name, String decription, int rating) {
        this.resourceId = resourceId;
        this.name = name;
        this.description = decription;
        Rating = rating;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = this.description;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
