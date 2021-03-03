package com.example.learnandroidnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        getSupportActionBar().setTitle("Other Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}