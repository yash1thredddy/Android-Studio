package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText FN,LN,PN,EM,FAN,MAN,BR;
Button Button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FN = findViewById(R.id.FName);
        LN = findViewById(R.id.LName);
        PN = findViewById(R.id.Phone1);
        EM = findViewById(R.id.Email);
        FAN = findViewById(R.id.FaName);
        MAN = findViewById(R.id.MaName1);
        BR = findViewById(R.id.Branch1);

        Button1 = findViewById(R.id.button);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Welcome "+ FN+" Last Name"+LN+" Phone"+PN+" Email"+EM+" Father Name"+FAN+" Mother Name"+MAN+" Branch "+BR, Toast.LENGTH_LONG).show();


            }
        });

    }
}