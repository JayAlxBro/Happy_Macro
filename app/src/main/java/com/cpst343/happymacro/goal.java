package com.cpst343.happymacro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class goal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goal);
    }

    public void backButtonClick(View view) {
        Intent intent = new Intent(this, little_info.class);
        startActivity(intent);
    }

    public void nextButtonClick(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}