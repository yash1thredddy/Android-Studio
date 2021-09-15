package com.example.relative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
EditText Inr,Output;
RadioGroup rg;
RadioButton rb;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        Inr = findViewById(R.id.Inr);
        Output = findViewById(R.id.Output);
        bt = findViewById(R.id.button);
        int num = rg.getCheckedRadioButtonId();
        rb = findViewById(num);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb.getText().equals("INDtoUS")){
                    int us = Integer.parseInt(Inr.getText().toString());
                    Output.setText(String.valueOf(us*70));
                }
                else if(rb.getText().equals("INDtoUK")){
                    int uk = Integer.parseInt(Inr.getText().toString());
                    Output.setText(String.valueOf(uk*90));
                }

            }
        });
    }
}