package com.example.akila.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * Shopping
 */

public class Shopping extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.Palm), getString(R.string.Shop1), R.drawable.square));
        locations.add(new Location(getString(R.string.AlexaAni), getString(R.string.Shop2), R.drawable.alexani));
        locations.add(new Location(getString(R.string.Labyrinth), getString(R.string.Shop3), R.drawable.books));
        locations.add(new Location(getString(R.string.MF), getString(R.string.Shop4), R.drawable.market));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
