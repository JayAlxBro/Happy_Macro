package com.cpst343.happymacro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class little_info extends AppCompatActivity {



    EditText etName, etAge, etHeight, etCurrentWeight, etGoalWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.little_info);

        etName = findViewById(R.id.newMacro);
        etAge = findViewById(R.id.age);
        etHeight = findViewById(R.id.height);
        etCurrentWeight = findViewById(R.id.currentWeight);
        etGoalWeight = findViewById(R.id.goalWeight);

        if( TextUtils.isEmpty(etName.getText())){
            etName.setError( "First name is required!" );
        }
        else{
        }
        if( TextUtils.isEmpty(etAge.getText())){
            etAge.setError( "Age is required!" );
        }
        else{
        }
        if( TextUtils.isEmpty(etHeight.getText())){
            etHeight.setError( "Height in Inches is required!" );
        }
        else{
        }
        if( TextUtils.isEmpty(etCurrentWeight.getText())){
            etCurrentWeight.setError( "Current Weight is required!" );
        }
        else{
        }
        if( TextUtils.isEmpty(etGoalWeight.getText())){
            etGoalWeight.setError( "Goal Weight is required!" );
        }
        else{
        }
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


