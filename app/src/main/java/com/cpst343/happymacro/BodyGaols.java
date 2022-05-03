package com.cpst343.happymacro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;

public class BodyGaols extends AppCompatActivity {

    NavigationBarView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.body_gaols);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.check);
        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(),SummaryActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.check:
                    return true;
                case R.id.edit:
                    startActivity(new Intent(getApplicationContext(), Tracker.class));
                    overridePendingTransition(0, 0);
                    return true;

            }
            return false;
        });




        SeekBar bar1 = findViewById(R.id.seekBar2);
        SeekBar bar2 = findViewById(R.id.seekBar3);
        SeekBar bar3 = findViewById(R.id.seekBar4);
        SeekBar bar4 = findViewById(R.id.seekBar5);

        bar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar bar1, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar bar1) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar bar1) {

            }


        });

        bar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar bar2, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar bar2) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar bar2) {

            }
        });

        bar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar bar3, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar bar3) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar bar3) {

            }
        });

        bar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar bar4, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar bar4) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar bar4) {

            }
        });



    }
    public void userInfo(View view) {
        Intent intent = new Intent(this, little_info.class);
        startActivity(intent);
    }

}