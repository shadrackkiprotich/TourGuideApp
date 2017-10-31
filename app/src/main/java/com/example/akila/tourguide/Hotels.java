package com.example.akila.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Hotels/Inns
 */

public class Hotels extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.N), getString(R.string.Hotel1), R.drawable.nassau));
        locations.add(new Location(getString(R.string.P), getString(R.string.Hotel2), R.drawable.peacock));
        locations.add(new Location(getString(R.string.M), getString(R.string.Hotel3), R.drawable.marriott));
        locations.add(new Location(getString(R.string.W), getString(R.string.Hotel4), R.drawable.westin));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
