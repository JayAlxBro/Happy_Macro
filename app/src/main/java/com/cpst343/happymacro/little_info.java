package com.cpst343.happymacro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class little_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_little_info);
    }

    /** Called when the user taps the Next button */
    public void nextButtonClick(View view) {
        Intent intent = new Intent(this, goal.class);
        startActivity(intent);
    }

    public void backButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
