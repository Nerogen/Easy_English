package com.example.easy_english_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GrammarActivityToBe extends AppCompatActivity {

    ImageButton exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_to_be);
        exercises = findViewById(R.id.Exercises);

        exercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToExercises(view);
            }
        });
    }

    private void goToExercises(View view){
        Intent intent = new Intent(this, GrammarExercisesToBe.class);
        startActivity(intent);
    }
}