package com.example.learnandroidnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnOpenOther, btnOpenTabbed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenOther = findViewById(R.id.btnOpenOther);
        btnOpenOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtherActivity();
            }
        });

        btnOpenTabbed = findViewById(R.id.btnOpenTabbed);
        btnOpenTabbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTabbedActivity();
            }
        });
    }

    private void openTabbedActivity() {
        startActivity(new Intent(this, TabbedActivity.class));
    }

    private void openOtherActivity() {
        Intent intent = new Intent(this, OtherActivity.class);
        startActivity(intent);
    }
}