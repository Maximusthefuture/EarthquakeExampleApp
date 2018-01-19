package com.maximus.earthquakeexampleapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);


//        earthquakes.add(new EarthQuake("4.5", "San Francisco", "12 Mar, 2010"));
//        earthquakes.add(new EarthQuake("London"));
//        earthquakes.add(new EarthQuake("Tokyo"));
//        earthquakes.add(new EarthQuake("Mexico City"));
//        earthquakes.add(new EarthQuake("Moscow"));
//        earthquakes.add(new EarthQuake("Rio de Janeiro"));
//        earthquakes.add(new EarthQuake("Paris"));


        ArrayList<EarthQuake> earthquakes = QueryUtils.extractEarthquakes();



        final EarthQuakeAdapter earthQuakeAdapter = new EarthQuakeAdapter(this, earthquakes);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(earthQuakeAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                EarthQuake currentEarthquake = earthQuakeAdapter.getItem(position);
                Uri earthquakeUri = Uri.parse(currentEarthquake.getUrl());
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);
                startActivity(websiteIntent);
            }
        });
    }
}
