package com.jatinsinghroha.printstudentdetails;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;

public class MainActivity3 extends AppCompatActivity {

    FloatingActionButton mComposeFAB;
    TextView mCheckMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mComposeFAB = findViewById(R.id.composeFAB);
        mCheckMail = findViewById(R.id.checkMailTV);

        mComposeFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(MainActivity3.this, "Compose Clicked", Toasty.LENGTH_LONG, true).show();
            }
        });

        mComposeFAB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                finish();
                return true;
            }
        });

        mCheckMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCheckMail.getText().toString().equals("Check your emails")){
                    mCheckMail.setText("Checking your emails...");
                }
                else{
                    mCheckMail.setText("Check your emails");
                }
                Toast.makeText(MainActivity3.this, mCheckMail.getText()+ "", Toast.LENGTH_LONG ).show();
            }
        });
    }
}