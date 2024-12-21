package com.example.que_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView imgup,imgdown,imgright,imgleft,imgbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgup = findViewById(R.id.imgup);
        imgdown = findViewById(R.id.imgdown);
        imgleft = findViewById(R.id.imgleft);
        imgright = findViewById(R.id.imgright);

        imgbox = findViewById(R.id.imgbox);




        imgup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slideup);
                imgbox.startAnimation(animation);




            }
        });

        imgright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slideright);
                imgbox.startAnimation(animation);
            }
        });

        imgleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slideleft);
                imgbox.startAnimation(animation);
            }
        });

        imgdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slidedown);
                imgbox.startAnimation(animation);
            }
        });

    }
}










