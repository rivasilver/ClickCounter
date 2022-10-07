package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private RelativeLayout relativeLayout;
    private TextView textViewNumber;
    private Button buttonPlus;
    private Button buttonMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        textViewNumber = findViewById(R.id.textViewNumber);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
    }
}