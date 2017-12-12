package com.android.petchoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK;
    ImageView imgpet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진 보기");
        text2 = (TextView)findViewById(R.id.text2);
        chkAgree = (CheckBox)findViewById(R.id.chkAgree);
        rGroup1 = (RadioGroup)findViewById(R.id.rGroup1);
        rdoDog = (RadioButton)findViewById(R.id.rdoDog);
        rdoCat = (RadioButton)findViewById(R.id.rdoCat);
        rdoRabbit = (RadioButton)findViewById(R.id.rdoRabbit);
        btnOK = (Button)findViewById(R.id.btnOK);
        imgpet = (ImageView)findViewById(R.id.imgpet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked() == true){
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    btnOK.setVisibility(android.view.View.VISIBLE);
                    imgpet.setVisibility(android.view.View.VISIBLE);
                }
                else {


                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    btnOK.setVisibility(android.view.View.INVISIBLE);
                    imgpet.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(rGroup1.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                        imgpet.setImageResource(R.drawable.mov21);
                        break;
                    case R.id.rdoCat:
                        imgpet.setImageResource(R.drawable.mov22);
                        break;
                    case R.id.rdoRabbit:
                        imgpet.setImageResource(R.drawable.mov23);
                        break;


                }
            }
        });

    }
}
