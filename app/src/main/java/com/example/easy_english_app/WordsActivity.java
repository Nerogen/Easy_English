package com.example.easy_english_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WordsActivity extends AppCompatActivity {

    ImageButton basic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        basic = findViewById(R.id.Basic);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToWord(view);
            }
        });
    }

    private void goToWord(View view) {
        Intent intent = new Intent(this, BasicDictionary.class);
        startActivity(intent);
    }
}