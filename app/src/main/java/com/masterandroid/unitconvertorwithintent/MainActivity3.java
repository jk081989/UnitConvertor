package com.masterandroid.unitconvertorwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textView2,textView4,textView6;
    EditText editTextNumberDecimal3;
    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        textView6 = findViewById(R.id.textView6);
        button6 = findViewById(R.id.button6);
        editTextNumberDecimal3 = findViewById(R.id.editTextNumberDecimal3);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               PoundtoKG();
            }
        });
    }

    private void PoundtoKG() {
        String ValueEnteredinPounds = editTextNumberDecimal3.getText().toString();
        double Pounds = Double.parseDouble(ValueEnteredinPounds);
        double kilos = Pounds/2.205;
        textView6.setText(""+kilos);
    }
}