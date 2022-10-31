package com.example.midtermtest;

import java.util.List;

public class LandmarkDataService {
    private final LandmarkLists landmarkLists = LandmarkLists.getInstance();
    public List<Landmark> getLandmarks(){
        return landmarkLists.getLandmarkList();
    }
    public List<Landmark> getFavoriteLandmark(){
        return landmarkLists.getFavoriteLandmarks();
    }
    public Landmark addToFavorite(int id){
        return landmarkLists.addToFavorite(id);
    }
    public Landmark removeFromFavorite(int id){
        return landmarkLists.removeFromFavorite(id);
    }
    public Landmark getLandmarkById(int id){
        return landmarkLists.getLandmarkById(id);
    }
}
