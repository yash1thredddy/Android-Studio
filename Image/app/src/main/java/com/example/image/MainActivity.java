MainActivity.java
        package com.example.image;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    CheckBox mad,oops,py;
    Button display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im = findViewById(R.id.imageView);
        mad = findViewById(R.id.MAD);
        oops = findViewById(R.id.OOPS);
        py = findViewById(R.id.PYTHON);
        display = findViewById(R.id.bottom);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.MAD:
                        if (mad.isChecked())
                            Toast.makeText(getApplicationContext(),"Mobile Application Development",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.OOPS:
                        if (mad.isChecked())
                            Toast.makeText(getApplicationContext()," OOPS
                                    ",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.PYTHON:
                        if (mad.isChecked())
                            Toast.makeText(getApplicationContext()," PYTHON
                                    ",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}