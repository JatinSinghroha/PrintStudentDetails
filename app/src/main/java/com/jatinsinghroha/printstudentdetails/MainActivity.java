package com.jatinsinghroha.printstudentdetails;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;
    Button dogBtn, catBtn, exitBtn;
    private static long back_pressed = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifecycleMethods", "onCreate Invoked.");
        setTitle("MainActivity 1");

        setFindViewByIDs();
        setOnClicks();
    }

    private void setFindViewByIDs() {
        mImageView = findViewById(R.id.imageView);
        dogBtn = findViewById(R.id.dogBtn);
        catBtn = findViewById(R.id.catBtn);
        exitBtn = findViewById(R.id.exitBtn);
    }

    //Hold Ctrl key on your keyboard
    private void setOnClicks() {
        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(R.drawable.dog);
                Toasty.info(MainActivity.this, "Dog button is clicked", Toast.LENGTH_SHORT, true).show();
            }
        });

        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(R.drawable.cat);
                Toasty.info(MainActivity.this, "Cat button is clicked", Toast.LENGTH_SHORT, true).show();
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(MainActivity.this, "Please come back", Toasty.LENGTH_LONG, false).show();
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(back_pressed + 2000 > System.currentTimeMillis())
            finish();
        else{
            back_pressed = System.currentTimeMillis();
            Toast.makeText(this, "Press once again to exit.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifecycleMethods", "onStart Invoked.");
    }

    @Override
    protected void onResume() {
        Log.i("LifecycleMethods", "onResume Invoked.");
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifecycleMethods", "onPause Invoked.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifecycleMethods", "onStop Invoked.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifecycleMethods", "onDestroy Invoked.");
    }


    private void changeImage(int image){
        mImageView.setImageResource(image);
    }


}