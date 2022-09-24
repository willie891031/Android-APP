package com.example.index;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //起始畫面
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //啟動MainActivity主頁，在主線程執行
                startActivity(new Intent(WelcomeActivity.this,TPIndex.class));
                //關閉當前頁面
                finish();
            }
        },2000);
    }
}