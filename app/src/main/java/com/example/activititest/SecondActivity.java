package com.example.activititest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView sname, name, patr, agess;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button2);
        sname = findViewById(R.id.surnameTextView);
        name = findViewById(R.id.textView);
        patr = findViewById(R.id.patron);
        agess = findViewById(R.id.ageS);

        Intent inte = getIntent();

        // Retrieve data from intent
        String surname = inte.getStringExtra("s");
        String nameText = inte.getStringExtra("n");
        String patronymicText = inte.getStringExtra("p");
        String agesText = inte.getStringExtra("a");

        // Set data to TextViews
        sname.setText("Surname: " + surname);
        name.setText("Name: " + nameText);
        patr.setText("Patronymic: " + patronymicText);
        agess.setText("Age: " + agesText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Return to MainActivity
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
