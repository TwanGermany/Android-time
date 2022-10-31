package com.example.midtermtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FavoriteListActivity extends AppCompatActivity {
    private RecyclerView rcvLandmark;
    private LandmarkAdapter landmarkAdapter;
    private List<Landmark> favoriteLandmarkList;
    private LandmarkDataService landmarkDataService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_list);
        Intent intent = getIntent();
        int[] landmarkIds = intent.getIntArrayExtra("landmark_id");
        List<Landmark> landmarkList = landmarkDataService.getLandmarks();
        favoriteLandmarkList = landmarkList.stream().filter(landmark -> Arrays.stream(landmarkIds).anyMatch(id -> id == landmark.getResourceId())).collect(Collectors.toList());
        rcvLandmark = findViewById(R.id.rcv_landmark);
        landmarkAdapter = new LandmarkAdapter(this);
        landmarkAdapter.setData(landmarkList);
        rcvLandmark.setAdapter(landmarkAdapter);
        rcvLandmark.setLayoutManager(new LinearLayoutManager(this));
    }
}