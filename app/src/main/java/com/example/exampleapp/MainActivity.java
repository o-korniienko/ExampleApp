package com.example.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText el1 = findViewById(R.id.num1);
        EditText el2 = findViewById(R.id.num2);
        TextView resText = findViewById(R.id.result);
        double num1 = Double.parseDouble(String.valueOf(el1.getText()));
        double num2 = Double.parseDouble(String.valueOf(el2.getText()));
        double resSum = num1 + num2;
        resText.setText(Double.toString(resSum));
    }
}
