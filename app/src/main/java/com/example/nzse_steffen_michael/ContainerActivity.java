package com.example.nzse_steffen_michael;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.nzse_steffen_michael.DataObjects.Screen;
import com.example.nzse_steffen_michael.fragments.CreateListing;
import com.example.nzse_steffen_michael.fragments.Favorites;
import com.example.nzse_steffen_michael.fragments.ImmoErgebnisse;
import com.example.nzse_steffen_michael.fragments.ImmoFilter;
import com.example.nzse_steffen_michael.fragments.Listing;
import com.example.nzse_steffen_michael.fragments.Profile;
import com.example.nzse_steffen_michael.fragments.Requests;

import java.util.HashMap;

public class ContainerActivity extends AppCompatActivity {

    private final HashMap<Screen, Class> screenFragmentMap = new HashMap<>();

    public ContainerActivity() {
        screenFragmentMap.put(Screen.RESULTS, ImmoErgebnisse.class);
        screenFragmentMap.put(Screen.FILTER, ImmoFilter.class);
        screenFragmentMap.put(Screen.LISTING, Listing.class);
        screenFragmentMap.put(Screen.PROFILE, Profile.class);
        screenFragmentMap.put(Screen.FAVORITES, Favorites.class);
        screenFragmentMap.put(Screen.CREATE_LISTING, CreateListing.class);
        screenFragmentMap.put(Screen.REQUESTS, Requests.class);
    }

    public void changeScreen(Screen screen) {
        Class fragmentClass = screenFragmentMap.get(screen);
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container_view, fragmentClass, null)
                .commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_screen);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            changeScreen(Screen.RESULTS);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.profile) {
            Toast.makeText(getApplicationContext(), "PROFILE", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}