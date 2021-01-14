package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView ser;
    TextView abut;
    TextView at;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        ser = findViewById(R.id.ser);
        abut = findViewById(R.id.abut);
        at = findViewById(R.id.at);

    }
}