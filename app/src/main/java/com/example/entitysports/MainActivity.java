package com.example.entitysports;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //**Open new Season_Actitvity from main page

        TextView season = (TextView) findViewById(R.id.season);
        season.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,SeasonActivity.class);
                startActivity(numbersIntent);

            }

         //Open new page HomeActivity
        });  TextView home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(numbersIntent);

            }
         //Open new page MenuActivity
        });  TextView menu = (TextView) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(numbersIntent);

            }

        });  TextView stats = (TextView) findViewById(R.id.stats);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,StatsActivity.class);
                startActivity(numbersIntent);

            }

        });


}}