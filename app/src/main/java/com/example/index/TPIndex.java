package com.example.index;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class TPIndex extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpindex);
        /**第一個輪播**/
        ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper);
        flipper.setFlipInterval(10000);
        flipper.startFlipping();
        /**第二個輪播**/
        ViewFlipper flipper2 = (ViewFlipper) findViewById(R.id.flipper2);
        flipper2.setFlipInterval(5000);
        flipper2.startFlipping();
        /**下導覽列**/
        RadioGroup rbGrop = findViewById(R.id.rg_main);
        rbGrop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rbGroup, int checkedId) {
                RadioButton rb = (RadioButton) findViewById(checkedId);
                if (checkedId == R.id.tp_information){
                    Intent intent = new Intent();
                    intent.setClass(TPIndex.this, MainActivity.class);
                    TPIndex.this.finish();
                    TPIndex.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_shop){
                    Intent intent = new Intent();
                    intent.setClass(TPIndex.this, MainActivity.class);
                    TPIndex.this.finish();
                    TPIndex.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_home){
                    Intent intent = new Intent();
                    intent.setClass(TPIndex.this, TPIndex.class);
                    TPIndex.this.finish();
                    TPIndex.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_cart){
                    Intent intent = new Intent();
                    intent.setClass(TPIndex.this, MainActivity.class);
                    TPIndex.this.finish();
                    TPIndex.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_user){
                    Intent intent = new Intent();
                    intent.setClass(TPIndex.this, MainActivity.class);
                    TPIndex.this.finish();
                    TPIndex.this.startActivity(intent);
                }
            }
        });
    }

}