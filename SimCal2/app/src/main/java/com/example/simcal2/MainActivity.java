package com.example.simcal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button bAdd,bSub,bMul,bClr,bEql;
EditText result;
String op;
int temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.Zero);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        bEql = findViewById(R.id.equal);

        bAdd = findViewById(R.id.add);
        bSub = findViewById(R.id.sub);
        bMul = findViewById(R.id.mul);
        bClr = findViewById(R.id.clear);

        result = findViewById(R.id.res);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("1"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("2"));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("3"));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("4"));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("5"));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("6"));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("7"));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("8"));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("9"));
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString().concat("0"));
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Integer.parseInt(result.getText().toString());
                op = "+";
                result.setText("");

            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Integer.parseInt(result.getText().toString());
                op = "-";
                result.setText("");

            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Integer.parseInt(result.getText().toString());
                op = "*";
                result.setText("");

            }
        });

        bClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = Integer.parseInt(result.getText().toString());
                result.setText("");

            }
        });

        bEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op.equals("+")){
                    int c = temp + Integer.parseInt(result.getText().toString());
                    result.setText(String.valueOf(c));
                }

                if(op.equals("-")){
                    int c = temp - Integer.parseInt(result.getText().toString());
                    result.setText(String.valueOf(c));
                }

                if(op.equals("*")){
                    int c = temp * Integer.parseInt(result.getText().toString());
                    result.setText(String.valueOf(c));
                }



            }
        });
    }
}