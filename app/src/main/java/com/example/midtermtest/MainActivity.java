package com.example.midtermtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvLandmark;
    private LandmarkAdapter landmarkAdapter;
    private LandmarkDataService landmarkDataService;
    private List<Landmark> landmarkList;
    private Button launchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        landmarkList = landmarkDataService.getLandmarks();
        rcvLandmark = findViewById(R.id.rcv_landmark);
        landmarkAdapter = new LandmarkAdapter(this);
        landmarkAdapter.setData(landmarkList);
        rcvLandmark.setAdapter(landmarkAdapter);
        rcvLandmark.setLayoutManager(new LinearLayoutManager(this));


    }
    private void launchFavoriteListActivity(){
        Intent intent = new Intent(MainActivity.this,FavoriteListActivity.class);
        List<Landmark> favoriteLandmarks = landmarkDataService.getFavoriteLandmark();
        int[] favoriteLandmarkId = favoriteLandmarks.stream().map(Landmark::getResourceId).mapToInt(Integer::intValue).toArray();
        if(favoriteLandmarks.size()>0){
            intent.putExtra("landmark_id", favoriteLandmarkId);
            startActivity(intent);
        }
    }
}



