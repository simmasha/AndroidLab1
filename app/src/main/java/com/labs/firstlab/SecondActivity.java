package com.labs.firstlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String color = getIntent().getStringExtra("color");
        int backgroundColor;

        switch (color){
            case "red":
                backgroundColor = Color.RED;
                break;
            case "green":
                backgroundColor = Color.GREEN;
                break;
            case "blue":
                backgroundColor = Color.BLUE;
                break;
            default:
                backgroundColor = Color.WHITE;
                break;
        }

        View layout = findViewById(android.R.id.content);
        layout.setBackgroundColor(backgroundColor);

    }
}