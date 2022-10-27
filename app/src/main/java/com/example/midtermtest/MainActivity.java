package com.example.midtermtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvLandmark;
    private LandmarkAdapter landmarkAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvLandmark = findViewById(R.id.rcv_landmark);
        landmarkAdapter = new LandmarkAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        rcvLandmark.setLayoutManager(linearLayoutManager);
        landmarkAdapter.setData(getListLandmark());
        rcvLandmark.setAdapter(landmarkAdapter);
    }

    private List<Landmark> getListLandmark() {
        List<Landmark> list = new ArrayList<>();
        list.add(new Landmark(R.drawable.dinhdoclap, "Dinh Độc Lập", "Independence Palace is a famous historical site for foreign and domestic visitors to Ho Chi Minh City.",2));
        list.add(new Landmark(R.drawable.buudienthanhpho, "Bưu Điện Thành Phố","Saigon Central Post Office is an iconic tourist stop in Ho Chi Minh City.",5));
        list.add(new Landmark(R.drawable.nhahatthanhpho, "Nhà Hát Thành phố","Saigon Opera House was built in 1898 following the “flamboyant” style of the French 3rd Republic,a National Relic of Vietnam",5));
        list.add(new Landmark(R.drawable.nhathoducba, "Nhà Thờ Đức Bà","Saigon Notre-Dame Cathedral is a unique architectural works attracting numerous tourists in Ho Chi Minh City. ",4));

        return list;
    }
}