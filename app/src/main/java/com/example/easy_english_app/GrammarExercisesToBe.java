package com.example.easy_english_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GrammarExercisesToBe extends AppCompatActivity {

    Spinner spinner1 = findViewById(R.id.spinner1);
    Spinner spinner2 = findViewById(R.id.spinner2);
    Spinner spinner3 = findViewById(R.id.spinner3);
    Spinner spinner4 = findViewById(R.id.spinner4);
    Spinner spinner5 = findViewById(R.id.spinner5);
    Spinner spinner6 = findViewById(R.id.spinner6);
    Spinner spinner7 = findViewById(R.id.spinner7);
    Spinner spinner8 = findViewById(R.id.spinner8);
    Spinner spinner9 = findViewById(R.id.spinner9);
    Spinner spinner10 = findViewById(R.id.spinner10);
    Spinner spinner11 = findViewById(R.id.spinner11);
    Spinner spinner12 = findViewById(R.id.spinner12);
    Spinner spinner13 = findViewById(R.id.spinner13);
    Spinner spinner14 = findViewById(R.id.spinner14);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_exercises_to_be);

        // variants of answers
        ArrayAdapter<String> isAreAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Is_are));
        isAreAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> amMAreAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Am_m_are));
        amMAreAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> isSAreAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.is_s_are));
        isSAreAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> sAreAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.s_are));
        sAreAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> isSAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.s_is));
        isSAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> iImAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.I_Im));
        iImAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> shesHesIsAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Shes_hes_is));
        shesHesIsAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> itsIamAnswer = new ArrayAdapter<>(GrammarExercisesToBe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.its_iam));
        itsIamAnswer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(isAreAnswer);
        spinner2.setAdapter(amMAreAnswer);
        spinner3.setAdapter(isAreAnswer);
        spinner4.setAdapter(isSAreAnswer);
        spinner5.setAdapter(isAreAnswer);
        spinner6.setAdapter(sAreAnswer);
        spinner7.setAdapter(isAreAnswer);
        spinner8.setAdapter(isSAnswer);
        spinner9.setAdapter(iImAnswer);
        spinner10.setAdapter(shesHesIsAnswer);
        spinner11.setAdapter(isAreAnswer);
        spinner12.setAdapter(isAreAnswer);
        spinner13.setAdapter(isAreAnswer);
        spinner14.setAdapter(itsIamAnswer);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

//                if (i == 1) {
//                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
//                } else if (i == 2) {
//                    startActivity(new Intent(MainActivity.this, WorkActivity.class));
//                }else if (i == 3) {
//                    startActivity(new Intent(MainActivity.this, OtherActivity.class));
//                }else if (i == 4) {
//                    startActivity(new Intent(MainActivity.this, CustomActivity.class));
//                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        spinner14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

    }
}