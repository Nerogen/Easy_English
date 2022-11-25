package com.example.easy_english_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GrammarActivity extends AppCompatActivity {

    ImageButton toBe, thisThat, ajectives, plurals, goHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        goHomeButton = findViewById(R.id.grammar_learn);
        thisThat = findViewById(R.id.this_that);
        ajectives = findViewById(R.id.adjectives);
        plurals = findViewById(R.id.plurals);
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

        thisThat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToThisThat(view);
            }
        });

        ajectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAdjectives(view);
            }
        });

        plurals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlurals(view);
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

    private void goToThisThat(View view) {
        Intent intent = new Intent(this, GrammarThisThere.class);
        startActivity(intent);
    }

    private void goToAdjectives(View view) {
        Intent intent = new Intent(this, GrammarAdjectives.class);
        startActivity(intent);
    }

    private void goToPlurals(View view) {
        Intent intent = new Intent(this, GrammarPlurals.class);
        startActivity(intent);
    }

}