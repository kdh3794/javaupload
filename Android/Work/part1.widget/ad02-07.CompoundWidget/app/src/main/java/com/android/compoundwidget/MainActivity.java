package com.android.compoundwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgpDirection = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgpDirection = findViewById(R.id.rgpDirection);

        rgpDirection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.rdoH){
                    rgpDirection.setOrientation(LinearLayout.HORIZONTAL);

                }
                else if (checkedId == R.id.rdoV){
                    rgpDirection.setOrientation(LinearLayout.VERTICAL);
                }

            }
        });

    }
}
