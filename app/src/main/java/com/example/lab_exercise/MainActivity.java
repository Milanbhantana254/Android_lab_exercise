package com.example.lab_exercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView textView_count;
    private EditText editText_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_count = findViewById(R.id.button_count);
        textView_count = findViewById(R.id.textView_count);
        editText_text = findViewById(R.id.editText);

        button_count.setOnClickListener(this::countUp);

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("Count");
            textView_count.setText(String.valueOf(mCount));
            editText_text.setText(savedInstanceState.getString("EditText_Text"));
        }
    }

    private void countUp(View view) {
        mCount++;
        if (textView_count != null) {
            textView_count.setText(String.valueOf(mCount));
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", mCount);
        outState.putString("EditText_Text", editText_text.getText().toString());
    }
}