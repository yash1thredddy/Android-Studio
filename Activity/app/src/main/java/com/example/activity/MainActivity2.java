package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
int num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        num1 = i.getIntExtra("n1",0);
        num2 = i.getIntExtra("n2",0);
        sum = num1 + num2;

        final EditText result = findViewById(R.id.ed3);
        result.setText(String.valueOf(sum));
    }
}