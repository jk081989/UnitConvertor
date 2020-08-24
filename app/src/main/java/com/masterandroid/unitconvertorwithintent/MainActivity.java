package com.masterandroid.unitconvertorwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KgtoPound();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PoundtoKG();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MilestoKM();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KMtoMiles();
            }
        });

    }

    private void KgtoPound() {
    Intent i1 = new Intent(this,MainActivity2.class);
    startActivity(i1);
    }

    private void PoundtoKG() {
        Intent i2 = new Intent(this,MainActivity3.class);
        startActivity(i2);
    }

    private void MilestoKM() {
        Intent i3 = new Intent(this,MainActivity4.class);
        startActivity(i3);
    }
    private void KMtoMiles() {
        Intent i4 = new Intent(this,MainActivity5.class);
        startActivity(i4);
    }

}