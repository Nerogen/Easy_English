package com.example.easy_english_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GrammarActivity extends AppCompatActivity {

    ImageButton goHomeButton;
    ImageButton toBe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        goHomeButton = findViewById(R.id.grammar_learn);
        toBe = findViewById(R.id.to_be);

        goHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHome(view);
            }
        });

        toBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToBe(view);
            }
        });


    }

    private void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void goToBe(View view) {
        Intent intent = new Intent(this, GrammarActivityToBe.class);
        startActivity(intent);
    }

}