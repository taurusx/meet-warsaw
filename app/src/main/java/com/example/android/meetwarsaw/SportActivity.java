package com.example.android.meetwarsaw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Sport and Leisure Activity - list of interesting locations.
 */

public class SportActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create an ArrayList of locations:
        final ArrayList<Location> locations = new ArrayList<>();


        locations.add(new Location(
                getString(R.string.sport_name_nationalstadium),
                Location.TYPE_SPORT,
                getString(R.string.sport_address_nationalstadium),
                getString(R.string.sport_description_nationalstadium),
                R.drawable.sport_stadium));
        locations.add(new Location(
                getString(R.string.sport_name_vistula),
                Location.TYPE_LEISURE,
                getString(R.string.sport_address_vistula),
                getString(R.string.sport_description_vistula),
                R.drawable.sport_vistulastairs));
        locations.add(new Location(
                getString(R.string.sport_name_bikeroute),
                Location.TYPE_SPORT,
                getString(R.string.sport_address_bikeroute),
                getString(R.string.sport_description_bikeroute),
                R.drawable.main_warsawcoa));
        locations.add(new Location(
                getString(R.string.sport_name_jutrzenka),
                Location.TYPE_SPORT,
                getString(R.string.sport_address_jutrzenka),
                getString(R.string.sport_description_jutrzenka),
                R.drawable.main_warsawcoa));
        locations.add(new Location(
                getString(R.string.sport_name_legia),
                Location.TYPE_SPORT,
                getString(R.string.sport_address_legia),
                getString(R.string.sport_description_legia),
                R.drawable.sport_legiastadium));
        locations.add(new Location(
                getString(R.string.sport_name_hybrydy),
                Location.TYPE_LEISURE,
                getString(R.string.sport_address_hybrydy),
                getString(R.string.sport_description_hybrydy),
                R.drawable.main_warsawcoa));
        locations.add(new Location(
                getString(R.string.sport_name_goldenterraces),
                Location.TYPE_LEISURE,
                getString(R.string.sport_address_goldenterraces),
                getString(R.string.sport_description_goldenterraces),
                R.drawable.sport_goldenterraces));
        locations.add(new Location(
                getString(R.string.sport_name_chopinconcerts),
                Location.TYPE_LEISURE,
                getString(R.string.sport_address_chopinconcerts),
                getString(R.string.sport_description_chopinconcerts),
                R.drawable.monuments_chopin));
        locations.add(new Location(
                getString(R.string.sport_name_fountain),
                Location.TYPE_LEISURE,
                getString(R.string.sport_address_fountain),
                getString(R.string.sport_description_fountain),
                R.drawable.sport_fountain));
        locations.add(new Location(
                getString(R.string.sport_name_sciencecopernicus),
                Location.TYPE_LEISURE,
                getString(R.string.sport_address_sciencecopernicus),
                getString(R.string.sport_description_sciencecopernicus),
                R.drawable.sport_sciencecentercopernicus));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s.
        // The adapter creates list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_sport);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);
    }
}
