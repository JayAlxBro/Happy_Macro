package com.cpst343.happymacro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class SummaryActivity extends AppCompatActivity {

    NavigationBarView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
                bottomNavigationView.setSelectedItemId(R.id.home);
                bottomNavigationView.setOnItemSelectedListener(item -> {

                    switch (item.getItemId()) {
                        case R.id.edit:
                            startActivity(new Intent(getApplicationContext(), Tracker.class));
                            overridePendingTransition(0, 0);
                            return true;
                        case R.id.home:
                            return true;
                        case R.id.check:
                            startActivity(new Intent(getApplicationContext(), BodyGaols.class));
                            overridePendingTransition(0, 0);
                            return true;

                    }
                    return false;
                });


        SeekBar seekBar = findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });


    }

    public void userInfo(View view) {
        Intent intent = new Intent(this, little_info.class);
        startActivity(intent);
    }
    public void trackerAddOnClick(View view) {
        Intent intent = new Intent(this, Tracker.class);
        startActivity(intent);
    }
}