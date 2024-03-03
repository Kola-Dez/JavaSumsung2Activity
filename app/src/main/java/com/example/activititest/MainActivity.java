package com.example.activititest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText surname, names, patronymic, ages;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        surname = findViewById(R.id.surname);
        names = findViewById(R.id.name);
        patronymic = findViewById(R.id.patr);
        ages = findViewById(R.id.age);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surnameText = surname.getText().toString();
                String namesText = names.getText().toString();
                String patronymicText = patronymic.getText().toString();
                String agesText = ages.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Pass data to SecondActivity
                intent.putExtra("s", surnameText);
                intent.putExtra("n", namesText);
                intent.putExtra("p", patronymicText);
                intent.putExtra("a", agesText);

                startActivity(intent);
            }
        });
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
