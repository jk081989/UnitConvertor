package com.masterandroid.unitconvertorwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText editTextNumberDecimal;
    TextView textview2,textView3,textView12;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        textView12 = findViewById(R.id.textView12);
        button2 = findViewById(R.id.button2);
        textview2 = findViewById(R.id.textview2);
        textView3 = findViewById(R.id.textView3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromKilotoPound();
            }
        });


    }

    private void ConvertFromKilotoPound() {
        String ValueEnteredinKilo = editTextNumberDecimal.getText().toString();
        double kilo = Double.parseDouble(ValueEnteredinKilo);
        double pounds = kilo*2.205;
        textView12.setText(""+pounds);
    }
}