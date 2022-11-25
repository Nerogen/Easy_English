package com.example.easy_english_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton grammarButton, listeningButton,
            wordsButton, readingButton, gameButton, analyticsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grammarButton = findViewById(R.id.grammar_button);
        listeningButton = findViewById(R.id.listening_button);
        wordsButton = findViewById(R.id.words_button);
        readingButton = findViewById(R.id.reading_button);
        gameButton = findViewById(R.id.grammar_game);
        analyticsButton = findViewById(R.id.grammar_about_us);

        grammarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToGrammar(view);
            }
        });

        listeningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToListening(view);
            }
        });

        readingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToReading(view);
            }
        });

        wordsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToWords(view);
            }
        });

    }

    private void goToGrammar(View view) {
        Intent intent = new Intent(this, GrammarActivity.class);
        startActivity(intent);
    }

    private void goToListening(View view) {
        Intent intent = new Intent(this, ListeningActivity.class);
        startActivity(intent);
    }

    private void goToReading(View view) {
        Intent intent = new Intent(this, ReadingActivity.class);
        startActivity(intent);
    }

    private void goToWords(View view) {
        Intent intent = new Intent(this, WordsActivity.class);
        startActivity(intent);
    }

//    private void goToGame(View view) {
//        Intent intent = new Intent(this, GrammarActivity.class);
//        startActivity(intent);
//    }
//
//    private void goToAnalytics(View view) {
//        Intent intent = new Intent(this, GrammarActivity.class);
//        startActivity(intent);
//    }

}
