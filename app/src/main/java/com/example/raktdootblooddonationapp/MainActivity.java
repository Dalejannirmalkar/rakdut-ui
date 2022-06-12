package com.example.raktdootblooddonationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<SearchBlood> extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);



        // Get the Intent that started this activity and extract the string
        Intent intent = new Intent(getApplicationContext(), Login_Gmail.class);
        startActivity(intent);
    }



}