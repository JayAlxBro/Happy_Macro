package com.cpst343.happymacro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Sign Up button
     */
    public void onSignUpButtonClick(View view) {
        Intent intent = new Intent(this, little_info.class);
        startActivity(intent);
    }
}

