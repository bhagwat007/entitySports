package com.example.entitysports;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //open new activity for ipl from Home Page
        TextView stats = (TextView) findViewById(R.id.ipl);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(HomeActivity.this,FhActivity1.class);
                startActivity(numbersIntent);

            }

        });
        // open new activity for icc match from Home page
        TextView icc = (TextView) findViewById(R.id.icc);
        icc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(HomeActivity.this,FhActivity2.class);
                startActivity(numbersIntent);

            }

        });
        // open new activity for india vs sri lank from Home page
        TextView IvsSri = (TextView) findViewById(R.id.indiaS);
        IvsSri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(HomeActivity.this,FhActivity3.class);
                startActivity(numbersIntent);

            }

        });


    }}