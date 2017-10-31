package com.example.akila.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Landmarks
 */

public class Landmarks extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.University), getString(R.string.LandAdd1), R.drawable.university));
        locations.add(new Location(getString(R.string.Drumthwacket), getString(R.string.LandAdd2), R.drawable.drumthwacket));
        locations.add(new Location(getString(R.string.PBSP), getString(R.string.LandAdd3), R.drawable.battlefield));
        locations.add(new Location(getString(R.string.QMH), getString(R.string.LandAdd4), R.drawable.quaker));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
