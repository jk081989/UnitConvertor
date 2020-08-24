package com.masterandroid.unitconvertorwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView textView9,textView10,textView11;
    EditText editTextNumberDecimal5;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        editTextNumberDecimal5 = findViewById(R.id.editTextNumberDecimal5);
        button8 = findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 KMtoMiles();
            }
        });
    }

    private void KMtoMiles() {
        String valueinKM = editTextNumberDecimal5.getText().toString();
        double km = Double.parseDouble(valueinKM);
        double miles = km/1.609;
        textView11.setText(""+miles);
    }
}