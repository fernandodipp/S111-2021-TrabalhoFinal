package com.example.senai_pdm_2021_exemplo1.apresentacao;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.senai_pdm_2021_exemplo1.R;

public class SplashIntro extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_intro);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashIntro.this, ReadBook.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}