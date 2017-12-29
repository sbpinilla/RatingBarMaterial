package com.sergio.ratingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialRatingBar materialRatingBar = findViewById(R.id.rtmEvento);

        materialRatingBar.setOnRatingChangeListener(new MaterialRatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChanged(MaterialRatingBar ratingBar, float rating) {

                Toast.makeText(getBaseContext(),"Rating is " +rating,Toast.LENGTH_LONG).show();

            }
        });

    }
}
