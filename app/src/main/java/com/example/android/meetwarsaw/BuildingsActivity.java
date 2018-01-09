package com.example.android.meetwarsaw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Buildings and Places Activity - list of interesting locations.
 */

public class BuildingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create an ArrayList of locations:
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(
                getString(R.string.buildings_name_palaceofculture),
                Location.TYPE_BUILDING,
                getString(R.string.buildings_address_palaceofculture),
                getString(R.string.buildings_description_palaceofculture),
                R.drawable.buildings_palaceofculture));
        locations.add(new Location(
                getString(R.string.buildings_name_citycenter),
                Location.TYPE_PLACE,
                getString(R.string.buildings_address_citycenter),
                getString(R.string.buildings_description_citycenter),
                R.drawable.buildings_citycenter));
        locations.add(new Location(
                getString(R.string.buildings_name_royalcastle),
                Location.TYPE_MUSEUM,
                getString(R.string.buildings_address_royalcastle),
                getString(R.string.buildings_description_royalcastle),
                R.drawable.buildings_royalcastle));
        locations.add(new Location(
                getString(R.string.buildings_name_wilanowpalace),
                Location.TYPE_MUSEUM,
                getString(R.string.buildings_address_wilanowpalace),
                getString(R.string.buildings_description_wilanowpalace),
                R.drawable.buildings_wilanowpalace));
        locations.add(new Location(
                getString(R.string.buildings_name_lazienkipalace),
                Location.TYPE_MUSEUM,
                getString(R.string.buildings_address_lazienkipalace),
                getString(R.string.buildings_description_lazienkipalace),
                R.drawable.buildings_palaceonwater));
        locations.add(new Location(
                getString(R.string.buildings_name_supremecourt),
                Location.TYPE_BUILDING,
                getString(R.string.buildings_address_supremecourt),
                getString(R.string.buildings_description_supremecourt),
                R.drawable.buildings_supremecourt));
        locations.add(new Location(
                getString(R.string.buildings_name_oldtown),
                Location.TYPE_PLACE,
                getString(R.string.buildings_address_oldtown),
                getString(R.string.buildings_description_oldtown),
                R.drawable.buildings_oldtown));
        locations.add(new Location(
                getString(R.string.buildings_name_barbican),
                Location.TYPE_PLACE,
                getString(R.string.buildings_address_barbican),
                getString(R.string.buildings_description_barbican),
                R.drawable.buildings_barbican));
        locations.add(new Location(
                getString(R.string.buildings_name_royalroute),
                Location.TYPE_PLACE,
                getString(R.string.buildings_address_royalroute),
                getString(R.string.buildings_description_royalroute),
                R.drawable.buildings_krakowskieprzedmiescie));
        locations.add(new Location(
                getString(R.string.buildings_name_filters),
                Location.TYPE_PLACE,
                getString(R.string.buildings_address_filters),
                getString(R.string.buildings_description_filters),
                R.drawable.buildings_filters));
        locations.add(new Location(
                getString(R.string.buildings_name_uprisingmuseum),
                Location.TYPE_MUSEUM,
                getString(R.string.buildings_address_uprisingmuseum),
                getString(R.string.buildings_description_uprisingmuseum),
                R.drawable.buildings_uprisingmuseum));
        locations.add(new Location(
                getString(R.string.buildings_name_polinjewishmuseum),
                Location.TYPE_MUSEUM,
                getString(R.string.buildings_address_polinjewishmuseum),
                getString(R.string.buildings_description_polinjewishmuseum),
                R.drawable.buildings_polinjewishmuseum));
        locations.add(new Location(
                getString(R.string.buildings_name_belvedere),
                Location.TYPE_BUILDING,
                getString(R.string.buildings_address_belvedere),
                getString(R.string.buildings_description_belvedere),
                R.drawable.buildings_belvedere));
        locations.add(new Location(
                getString(R.string.buildings_name_universitylibrary),
                Location.TYPE_BUILDING,
                getString(R.string.buildings_address_universitylibrary),
                getString(R.string.buildings_description_universitylibrary),
                R.drawable.buildings_universitylibrary));


        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s.
        // The adapter creates list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_buildings);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);
    }
}
