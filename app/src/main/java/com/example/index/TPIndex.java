package com.example.index;

import static com.example.index.ActivityTo.doFinishAndStart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

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
                    doFinishAndStart(TPIndex.this,member.class);
                }
                else if (checkedId == R.id.tp_shop){
                    doFinishAndStart(TPIndex.this,MainActivity.class);
                }
                else if (checkedId == R.id.tp_home){
                    doFinishAndStart(TPIndex.this,TPIndex.class);
                }
                else if (checkedId == R.id.tp_cart){
                    doFinishAndStart(TPIndex.this,shopcar.class);
                }
                else if (checkedId == R.id.tp_user){
                    doFinishAndStart(TPIndex.this,signin.class);
                }
            }
        });
    }

}