package com.example.android.meetwarsaw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Food and Drinks Activity - list of interesting locations.
 */

public class FoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create an ArrayList of locations:
        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(
                getString(R.string.fooddrink_name_efeskebab),
                Location.TYPE_FOOD,
                getString(R.string.fooddrink_address_efeskebab),
                getString(R.string.fooddrink_description_efeskebab)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_meatbusters),
                Location.TYPE_FOOD,
                getString(R.string.fooddrink_address_meatbusters),
                getString(R.string.fooddrink_description_meatbusters)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_warburger),
                Location.TYPE_FOOD,
                getString(R.string.fooddrink_address_warburger),
                getString(R.string.fooddrink_description_warburger)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_milkbar),
                Location.TYPE_FOOD,
                getString(R.string.fooddrink_address_milkbar),
                getString(R.string.fooddrink_description_milkbar)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_ciaopizzeria),
                Location.TYPE_FOOD,
                getString(R.string.fooddrink_address_ciaopizzeria),
                getString(R.string.fooddrink_description_ciaopizzeria)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_wawphoasian),
                Location.TYPE_FOOD,
                getString(R.string.fooddrink_address_wawphoasian),
                getString(R.string.fooddrink_description_wawphoasian)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_piwpaw),
                Location.TYPE_DRINK,
                getString(R.string.fooddrink_address_piwpaw),
                getString(R.string.fooddrink_description_piwpaw)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_czupito),
                Location.TYPE_DRINK,
                getString(R.string.fooddrink_address_czupito),
                getString(R.string.fooddrink_description_czupito)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_towarzyskacafe),
                Location.TYPE_DRINK,
                getString(R.string.fooddrink_address_towarzyskacafe),
                getString(R.string.fooddrink_description_towarzyskacafe)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_nitrolody),
                Location.TYPE_FOOD,
                getString(R.string.fooddrink_address_nitrolody),
                getString(R.string.fooddrink_description_nitrolody)));
        locations.add(new Location(
                getString(R.string.fooddrink_name_f30),
                Location.TYPE_DRINK,
                getString(R.string.fooddrink_address_f30)));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s.
        // The adapter creates list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_fooddrink);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);
    }
}
