package com.example.midtermtest;

import java.util.Comparator;

public class Landmark {
    private int id;
    private int resourceId;
    private String name;
    private String description;
    private int Rating;
    private boolean isFavorite;
    public static int idCounter = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Landmark(){
        this.id = ++idCounter;
        this.isFavorite = false;
    }

    public Landmark(int resourceId, String name, String description, int rating, boolean isFavorite) {
        this.resourceId = resourceId;
        this.name = name;
        this.description = description;
        Rating = rating;
        this.isFavorite = isFavorite;
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

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
