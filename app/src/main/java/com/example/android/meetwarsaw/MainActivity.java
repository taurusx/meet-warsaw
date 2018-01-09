package com.example.android.meetwarsaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the buildings category
        TextView buildingsTextView = (TextView) findViewById(R.id.textview_main_buildings);
        // Set a click listener on that View
        buildingsTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the buildings View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BuildingsActivity}
                Intent buildingsIntent = new Intent(view.getContext(), BuildingsActivity.class);
                startActivity(buildingsIntent);
            }
        });

        // Find the View that shows the monuments category
        TextView monumentsTextView = (TextView) findViewById(R.id.textview_main_monuments);
        // Set a click listener on that View
        monumentsTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the monuments View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MonumentsActivity}
                Intent monumentsIntent = new Intent(view.getContext(), MonumentsActivity.class);
                startActivity(monumentsIntent);
            }
        });

        // Find the View that shows the food category
        TextView foodTextView = (TextView) findViewById(R.id.textview_main_fooddrink);
        // Set a click listener on that View
        foodTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent foodIntent = new Intent(view.getContext(), FoodActivity.class);
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the sport category
        TextView sportTextView = (TextView) findViewById(R.id.textview_main_sport);
        // Set a click listener on that View
        sportTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sport View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SportActivity}
                Intent sportIntent = new Intent(view.getContext(), SportActivity.class);
                startActivity(sportIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuitem_main_credits:
                // Create a new intent to open the {@link CreditsActivity}
                Intent creditsIntent = new Intent(this, CreditsActivity.class);
                startActivity(creditsIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
