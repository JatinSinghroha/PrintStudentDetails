package com.jatinsinghroha.printstudentdetails.layoutexamples;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.jatinsinghroha.printstudentdetails.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class RelativeLayoutExample extends AppCompatActivity {

    SwitchCompat mSaveCatsSwitch;
    ImageView dog1, dog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_example);

        mSaveCatsSwitch = findViewById(R.id.saveCatsSwitch);
        dog1 = findViewById(R.id.leftTop);
        dog2 = findViewById(R.id.bottomRight);

        mSaveCatsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    dog1.setVisibility(View.INVISIBLE);
                    dog2.setVisibility(View.INVISIBLE);
                }
                else{
                    dog1.setVisibility(View.VISIBLE);
                    dog2.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}