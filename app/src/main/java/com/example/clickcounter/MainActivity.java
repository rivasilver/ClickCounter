package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textViewNumber;
    private Button buttonPlus;
    private Button buttonMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        final int[] counter = {0};
        textViewNumber.setText(String.valueOf(counter[0]));

        buttonPlus.setOnClickListener(view -> {
            counter[0] += 1;
            textViewNumber.setText(String.valueOf(counter[0]));
        });

        buttonMinus.setOnClickListener(view -> {
            counter[0] -= 1;
            textViewNumber.setText(String.valueOf(counter[0]));
        });

        textViewNumber.setOnClickListener(view -> {
            counter[0] = 0;
            textViewNumber.setText(String.valueOf(counter[0]));
        });
    }

    public void init(){
        textViewNumber = findViewById(R.id.textViewNumber);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
    }
}