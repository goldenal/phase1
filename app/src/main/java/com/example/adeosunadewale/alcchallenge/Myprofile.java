package com.example.adeosunadewale.alcchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Myprofile extends AppCompatActivity {
    ImageButton imageButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        imageButton = findViewById(R.id.backpress);
        imageView = findViewById(R.id.selfie);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        Glide.with(this).load(R.drawable.selfie).dontAnimate().into(imageView);
    }
}
