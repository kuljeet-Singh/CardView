package com.example.n01202455.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homepage = new Intent(MainActivity.this,description.class);
                startActivity(homepage);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
