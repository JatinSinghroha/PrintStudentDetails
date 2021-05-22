package com.jatinsinghroha.printstudentdetails.layoutexamples;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.jatinsinghroha.printstudentdetails.R;
import com.shashank.sony.fancydialoglib.Animation;
import com.shashank.sony.fancydialoglib.FancyAlertDialog;
import com.shashank.sony.fancydialoglib.Icon;

import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;

public class TableLayoutExample extends AppCompatActivity {

    EditText nameET, courseET, cityET;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout_example);

        nameET = findViewById(R.id.nameET);
        courseET = findViewById(R.id.courseET);
        cityET = findViewById(R.id.cityET);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(v -> {
            if (!nameET.getText().toString().trim().isEmpty() &&
                    !courseET.getText().toString().trim().isEmpty() &&
                    !cityET.getText().toString().trim().isEmpty()) {

                String message = "Name = "+nameET.getText().toString().trim()+
                                "\nCourse = "+courseET.getText().toString().trim()+
                                "\nCity = "+cityET.getText().toString().trim();

                new FancyAlertDialog.Builder(this)
                        .setTitle("Form Submitted")
                        .setBackgroundColor(Color.parseColor("#009900"))
                        .setMessage(message)
                        .setNegativeBtnText("Cancel")
                        .setPositiveBtnBackground(Color.parseColor("#009900"))
                        .setPositiveBtnText("Okay")
                        .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))
                        .setAnimation(Animation.POP)
                        .isCancellable(false)
                        .setIcon(R.drawable.ic_baseline_done_24, Icon.Visible)
                        .OnPositiveClicked(() -> Toasty.success(TableLayoutExample.this, "Thank you for Submitting your form", Toasty.LENGTH_LONG, true).show())
                        .OnNegativeClicked(() ->
                                finish()
                                )
                        .build();

            } else {
                Toasty.error(TableLayoutExample.this, "Please fill all fields properly.", Toasty.LENGTH_LONG, true).show();
            }
        });
    }
}
//Ctrl + Alt + L for linting or indentation in Android Studio