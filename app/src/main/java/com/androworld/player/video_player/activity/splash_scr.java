package com.androworld.player.video_player.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.androworld.player.video_player.R;
import com.google.android.gms.ads.AdRequest;



public class splash_scr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_scr);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(splash_scr.this, home.class));

            }
        },3000);

    }


    @Override
    protected void onPause() {

        super.onPause();
        finish();

    }

}