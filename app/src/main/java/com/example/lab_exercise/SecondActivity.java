package com.example.lab_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView_count = findViewById(R.id.textView_count);
        Intent intent = getIntent();
        int count = intent.getIntExtra("Count", 0);
        textView_count.setText(String.valueOf(count));

    }
}