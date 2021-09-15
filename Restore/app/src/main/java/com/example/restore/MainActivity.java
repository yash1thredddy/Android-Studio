package com.example.restore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button cnt,dec;
TextView tv;
int count;
int dec1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            String message = savedInstanceState.getString("message");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            count = savedInstanceState.getInt("counter", 0);
        }
        cnt = findViewById(R.id.button);
        dec = findViewById(R.id.button1);
        tv = findViewById(R.id.textView);
        tv.setText(String.valueOf(count));

        cnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = Integer.valueOf(tv.getText().toString()) + 1;
                tv.setText(String.valueOf(count));
            }

    });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dec1 = Integer.valueOf(tv.getText().toString()) -  1;
                tv.setText(String.valueOf(dec1));
            }
        });
    }
}