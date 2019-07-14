package com.example.adeosunadewale.alcchallenge;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    //initialising variables
    private Button profileBtn;
    private Button aboutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        //to make the activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
       profileBtn = findViewById(R.id.btnProfile);
       aboutBtn = findViewById(R.id.btnAbout);


        //setting the click listener for our buttons
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goes to myprofile activity
                Intent intent = new Intent(MainActivity.this,Myprofile.class);
                startActivity(intent);
            }
        });
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goes to aboutAlc activity
                Intent intent = new Intent(MainActivity.this,AboutAlc.class);
                startActivity(intent);
            }
        });
    }
}
