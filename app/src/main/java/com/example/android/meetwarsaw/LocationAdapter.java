package com.example.android.meetwarsaw;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Custom Adapter to populate sets of locations proposed to visit to a item_location views.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Resource ID for the background color for current list of locations
     */
    private int mColorResourceId;

    /**
     * This is custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists (Location details).
     *
     * @param context         The current context. Used to inflate the layout file.
     * @param locations       A List of Location objects to display in a list
     * @param colorResourceId Color to be set as background color for the list
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for few TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_location, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the item_location.xml layout with the ID textview_listview_name
        TextView nameTextView = listItemView.findViewById(R.id.textview_listview_name);
        // Get the name from the current Location object and
        // set this text on the Name TextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the item_location.xml layout with the ID textview_listview_type
        TextView typeTextView = listItemView.findViewById(R.id.textview_listview_type);
        // Get the type from the current Location object and
        // set this text on the Type TextView
        typeTextView.setText(currentLocation.getType());

        // Find the TextView in the item_location.xml layout with the ID textview_listview_info
        TextView infoTextView = listItemView.findViewById(R.id.textview_listview_info);
        // Get the description and address from the current Location object and
        // set this text on the Info TextView
        String infoText = currentLocation.getDescription() +
                "\n" + currentLocation.getAddress();
        infoTextView.setText(infoText);


        // Find the ImageView in the item_location.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Location object and
        // set this ID on the item ImageView

        // Check if an image is provided for this Location or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentLocation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView group in the item_location.xml layout with the ID text_container
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set given color as a background color for a ViewGroup
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 3 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
