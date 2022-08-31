package com.example.easy_english_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton grammarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grammarButton = findViewById(R.id.grammar_button);

        grammarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToGrammar(view);
            }
        });

    }

    private void goToGrammar(View view) {
        Intent intent = new Intent(this, GrammarActivity.class);
        startActivity(intent);
    }

}
