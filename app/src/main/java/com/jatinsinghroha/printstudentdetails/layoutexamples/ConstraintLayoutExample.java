package com.jatinsinghroha.printstudentdetails.layoutexamples;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.jatinsinghroha.printstudentdetails.R;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintLayoutExample extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout_example);

        mImageView = findViewById(R.id.imageView4);

        mImageView.setOnClickListener(v -> {
            mImageView.setVisibility(View.INVISIBLE);
        });
    }
}