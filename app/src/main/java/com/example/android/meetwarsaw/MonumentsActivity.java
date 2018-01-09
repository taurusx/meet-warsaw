package com.example.android.meetwarsaw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Monuments and Parks Activity - list of interesting locations.
 */

public class MonumentsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create an ArrayList of locations:
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(
                getString(R.string.monuments_name_littleinsurrectionist),
                Location.TYPE_MONUMENT,
                getString(R.string.monuments_address_littleinsurrectionist),
                getString(R.string.monuments_description_littleinsurrectionist),
                R.drawable.monuments_littleinsurrectionist));
        locations.add(new Location(
                getString(R.string.monuments_name_uprising),
                Location.TYPE_MONUMENT,
                getString(R.string.monuments_address_uprising),
                getString(R.string.monuments_description_uprising),
                R.drawable.monuments_uprising));
        locations.add(new Location(
                getString(R.string.monuments_name_chopin),
                Location.TYPE_MONUMENT,
                getString(R.string.monuments_address_chopin),
                getString(R.string.monuments_description_chopin),
                R.drawable.monuments_chopin));
        locations.add(new Location(
                getString(R.string.monuments_name_copernicus),
                Location.TYPE_MONUMENT,
                getString(R.string.monuments_address_copernicus),
                getString(R.string.monuments_description_copernicus),
                R.drawable.monuments_copernicus));
        locations.add(new Location(
                getString(R.string.monuments_name_sigismundscolumn),
                Location.TYPE_MONUMENT,
                getString(R.string.monuments_address_sigismundscolumn),
                getString(R.string.monuments_description_sigismundscolumn),
                R.drawable.monuments_sigismundscolumn));
        locations.add(new Location(
                getString(R.string.monuments_name_mermaidoldtown),
                Location.TYPE_MONUMENT,
                getString(R.string.monuments_address_mermaidoldtown),
                getString(R.string.monuments_description_mermaidoldtown),
                R.drawable.monuments_mermaidoldtown));
        locations.add(new Location(
                getString(R.string.monuments_name_mermaidpowisle),
                Location.TYPE_MONUMENT,
                getString(R.string.monuments_address_mermaidpowisle),
                getString(R.string.monuments_description_mermaidpowisle),
                R.drawable.monuments_mermaidvistula));
        locations.add(new Location(
                getString(R.string.monuments_name_saxongarden),
                Location.TYPE_PARK,
                getString(R.string.monuments_address_saxongarden),
                getString(R.string.monuments_description_saxongarden),
                R.drawable.monuments_saxonpark));
        locations.add(new Location(
                getString(R.string.monuments_name_lazienkibathspark),
                Location.TYPE_PARK,
                getString(R.string.monuments_address_lazienkibathspark),
                getString(R.string.monuments_description_lazienkibathspark),
                R.drawable.monuments_royalbaths));
        locations.add(new Location(
                getString(R.string.monuments_name_mokotowfield),
                Location.TYPE_PARK,
                getString(R.string.monuments_address_mokotowfield),
                getString(R.string.monuments_description_mokotowfield),
                R.drawable.monuments_mokotowfield));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s.
        // The adapter creates list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_monuments);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);
    }
}
