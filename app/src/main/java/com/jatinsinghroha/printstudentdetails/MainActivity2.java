package com.jatinsinghroha.printstudentdetails;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    ImageView mImageView2;
    Button dogBtn2, catBtn2, exitBtn2;
    String mAnimalName = "";
    int dogClicks = 0, catClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("MainActivity 2");

        mImageView2 = findViewById(R.id.imageView2);
        dogBtn2 = findViewById(R.id.dogBtn2);
        catBtn2 = findViewById(R.id.catBtn2);
        exitBtn2 = findViewById(R.id.exitBtn2);

        dogBtn2.setOnClickListener(this);
        catBtn2.setOnClickListener(this);
        exitBtn2.setOnClickListener(this);
        mImageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
            case R.id.dogBtn2:
                dogClicks++;
                mAnimalName = "Animal is Dog";
                mImageView2.setImageResource(R.drawable.dog);
                Toasty.info(this, "Dog button is clicked", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.catBtn2:
                catClicks++;
                mAnimalName = "Animal is Cat";
                mImageView2.setImageResource(R.drawable.cat);
                Toasty.info(this, "Cat button is clicked", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.imageView2:
                if(mAnimalName.isEmpty())
                    Toasty.warning(this, "There is no animal image.", Toast.LENGTH_LONG, true).show();
                else
                Toasty.success(this, mAnimalName, Toast.LENGTH_LONG, true).show();
                break;
            default:
            case R.id.exitBtn2:
                Log.i("TRACK", "Dog clicks = "+dogClicks+" , Cat clicks = "+catClicks);
                Toasty.error(this, "Please come back", Toasty.LENGTH_LONG, false).show();
                finish();
                break;
        }
    }

//    public void onButtonsClick(View view){
//        switch (view.getId()){
//            case R.id.dogBtn2:
//                mImageView2.setImageResource(R.drawable.dog);
//                break;
//            case R.id.catBtn2:
//                mImageView2.setImageResource(R.drawable.cat);
//                break;
//            default:
//            case R.id.exitBtn2:
//                finish();
//                break;
//        }
//    }
}