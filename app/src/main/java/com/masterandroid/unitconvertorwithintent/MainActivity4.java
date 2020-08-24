package com.masterandroid.unitconvertorwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity4 extends AppCompatActivity {

    TextView textView5,textView7,textView8;
    EditText editTextNumberDecimal4;
    Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView5 = findViewById(R.id.textView5);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        editTextNumberDecimal4 = findViewById(R.id.editTextNumberDecimal4);
        button7 = findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MilestoKM();
            }
        });

    }

    private void MilestoKM() {
        String ValueEnteredinMiles = editTextNumberDecimal4.getText().toString();
        double miles = Double.parseDouble(ValueEnteredinMiles);
        double killometer = miles*1.609;
        textView8.setText(""+killometer);
    }
}