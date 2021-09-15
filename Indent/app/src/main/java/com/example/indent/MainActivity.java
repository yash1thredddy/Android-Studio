package com.example.indent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.edit1);
    }

    public void SendMail(View view) {

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        String[] urname = {"yashwanth@gmail.com","123@gmail.com"};
        i.putExtra(Intent.EXTRA_EMAIL,urname);
        i.putExtra(Intent.EXTRA_SUBJECT,"This is Android Studio Class");
        String msg = ed1.getText().toString();
        i.putExtra(Intent.EXTRA_TEXT,msg);


        if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }
    }

    public void OpenBrowser(View view) {

        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com/"));

        if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }
    }
}