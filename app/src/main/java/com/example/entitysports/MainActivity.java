package com.example.entitysports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.entitysports.databinding.ActivityMainBinding;


public class  MainActivity extends DrawerBaseActivity {


    ActivityMainBinding activityMainBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        //**Open new Season_Actitvity from main page

        //in this seasonB is id for linearlayout there for we use Linearlayout ----- = (LinearLayout)--------(R.id.---)
        LinearLayout season = (LinearLayout) findViewById(R.id.seasonB);
        season.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, SeasonActivity.class);
                startActivity(numbersIntent);

            }

            //Open new page HomeActivity
        });
        LinearLayout home = (LinearLayout) findViewById(R.id.homeB);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(numbersIntent);

            }
            //Open new page MenuActivity
        });
        LinearLayout menu = (LinearLayout) findViewById(R.id.menuB);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(numbersIntent);

            }

        });
        LinearLayout stats = (LinearLayout) findViewById(R.id.statsB);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, StatsActivity.class);
                startActivity(numbersIntent);

            }

        });


    }}