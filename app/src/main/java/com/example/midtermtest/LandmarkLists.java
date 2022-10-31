package com.example.midtermtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LandmarkLists {
    private final List<Landmark> landmarkList = new ArrayList<>();
    public static LandmarkLists instance;
    public static LandmarkLists getInstance() {
        if (instance == null) {
            instance = new LandmarkLists();
        }
        return instance;
    }

    private LandmarkLists() {
        landmarkList.add(new Landmark(R.drawable.dinhdoclap, "Dinh Độc Lập", "Independence Palace is a famous historical site for foreign and domestic visitors to Ho Chi Minh City.", 2, false));
        landmarkList.add(new Landmark(R.drawable.buudienthanhpho, "Bưu Điện Thành Phố", "Saigon Central Post Office is an iconic tourist stop in Ho Chi Minh City.", 5, false));
        landmarkList.add(new Landmark(R.drawable.nhahatthanhpho, "Nhà Hát Thành phố", "Saigon Opera House was built in 1898 following the “flamboyant” style of the French 3rd Republic,a National Relic of Vietnam", 5, false));
        landmarkList.add(new Landmark(R.drawable.nhathoducba, "Nhà Thờ Đức Bà", "Saigon Notre-Dame Cathedral is a unique architectural works attracting numerous tourists in Ho Chi Minh City. ", 4, false));
    }
    public List<Landmark> getLandmarkList(){
        return landmarkList;
    }
    public List<Landmark> getFavoriteLandmarks(){
        List<Landmark> favoriteLandmarkLists = new ArrayList<>();
        for(Landmark landmark : landmarkList){
            if (landmark.isFavorite()){
                favoriteLandmarkLists.add(landmark);
            }
        }
        return favoriteLandmarkLists;
    }
    public Landmark getLandmarkById(int id){
        return landmarkList.stream().filter(landmark -> landmark.getId() == id).findFirst().orElse(null);
    }
    public Landmark addToFavorite(int id){
        Landmark landmark = getLandmarkById(id);
        landmark.setFavorite(true);
        return landmark;
    }
    public Landmark removeFromFavorite(int id){
        Landmark landmark = getLandmarkById(id);
        landmark.setFavorite(false);
        return landmark;
    }
}

