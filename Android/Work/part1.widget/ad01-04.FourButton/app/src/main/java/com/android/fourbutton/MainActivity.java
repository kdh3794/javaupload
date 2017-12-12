package com.android.fourbutton;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nate.com"));
                startActivity(i);
                }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel://119"));
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               String url = "content://media/internal/images/media";
               Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
               startActivity(i);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
