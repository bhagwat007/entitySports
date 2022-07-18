package com.example.entitysports;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SeasonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        ArrayList<String> year = new ArrayList<>();

        year.add("2022") ;
        year.add("2021");
        year.add("2020");
        year.add("2019");
        year.add("2018");
        year.add("2017");
        year.add("2016");
        year.add("2015");
        year.add("2014");
        year.add("2013");
        year.add("2012");
        year.add("2011");
        year.add("2010");
        year.add("2009");
        year.add("2008");
        year.add("2007") ;
        year.add("2006");
        year.add("2005");
        year.add("2004");
        year.add("2003");
        year.add("2002");
        year.add("2001");
        year.add("2000");
        year.add("1999");
        year.add("1998");
        year.add("1997");
        year.add("1996");
        year.add("1995");
        year.add("1994");
        year.add("1993");

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,year);
        ListView listView = (ListView)findViewById(R.id.list) ;
        listView.setAdapter(itemAdapter);

        }


    }
