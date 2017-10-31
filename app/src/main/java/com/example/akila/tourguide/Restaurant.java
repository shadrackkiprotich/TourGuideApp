package com.example.akila.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Restaurants
 */

public class Restaurant extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.thebentspoon), getString(R.string.restadd1), R.drawable.bentspoon));
        locations.add(new Location(getString(R.string.Agri), getString(R.string.RestAdd2), R.drawable.agricola));
        locations.add(new Location(getString(R.string.Yank), getString(R.string.RestAdd3), R.drawable.taproom));
        locations.add(new Location(getString(R.string.Alchemist), getString(R.string.RestAdd4), R.drawable.alchemist));
        locations.add(new Location(getString(R.string.BluePoint), getString(R.string.RestAdd5), R.drawable.bluepoint));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_color);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
