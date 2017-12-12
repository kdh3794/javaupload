package com.android.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1 = null;
    private Button button2 = null;
    private Button button3 = null;
    private Button button4 = null;
    private Button button5 = null;
    private EditText editText = null;
    private EditText editText2 = null;
    private TextView textView = null;
    private  int num1, num2;
    Integer Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);


        View.OnClickListener clisten = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(editText.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
               if (num1 ==1 && num2 == 0)
               {
                   Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다."
                           , Toast.LENGTH_SHORT).show();
               }
               switch (view.getId()){
                   case R.id.button1:
                   Result = num1 + num2;
                   break;
                   case R.id.button2:
                       Result = num1 - num2;
                       break;
                   case R.id.button3:
                       Result = num1 * num2;
                       break;
                   case R.id.button4:
                       Result = num1 / num2;
                       break;
                   case R.id.button5:
                   Result = num1 % num2;
                   break;

               }
               textView.setText("계산결과" + Result);
               textView.setTextSize(30);

            }
        };
        button1.setOnClickListener(clisten);
        button2.setOnClickListener(clisten);
        button3.setOnClickListener(clisten);
        button4.setOnClickListener(clisten);
        button5.setOnClickListener(clisten);

    }

}
