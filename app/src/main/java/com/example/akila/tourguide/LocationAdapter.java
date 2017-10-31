package com.example.akila.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class LocationAdapter extends ArrayAdapter<Location> {
    private int colorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorId) {
        super(context, 0, locations);
        colorResourceId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        //location name
        TextView locTextView = (TextView) listItemView.findViewById(R.id.loc_text_view);
        locTextView.setText(currentLocation.getName());
        //location address
        TextView locAddView = (TextView) listItemView.findViewById(R.id.loc_add_view);
        locAddView.setText(currentLocation.getAddress());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentLocation.hasImage()){
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
