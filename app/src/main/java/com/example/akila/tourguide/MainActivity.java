package com.example.akila.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rest = (TextView) findViewById(R.id.restaurants);
        rest.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent restaurantIntent = new Intent(MainActivity.this, Restaurant.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });

        TextView shop = (TextView) findViewById(R.id.shopping);
        shop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent shopIntent = new Intent(MainActivity.this, Shopping.class);

                // Start the new activity
                startActivity(shopIntent);
            }
        });

        TextView land = (TextView) findViewById(R.id.landmark);
        land.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent landmarkIntent = new Intent(MainActivity.this, Landmarks.class);

                // Start the new activity
                startActivity(landmarkIntent);
            }
        });

        TextView hotel = (TextView) findViewById(R.id.hotel);
        hotel.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hotelIntent = new Intent(MainActivity.this, Hotels.class);

                // Start the new activity
                startActivity(hotelIntent);
            }
        });
    }
}
