package com.cpst343.happymacro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class BodyGaols extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.body_gaols);

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




    }
    public void userInfo(View view) {
        Intent intent = new Intent(this, little_info.class);
        startActivity(intent);
    }

}