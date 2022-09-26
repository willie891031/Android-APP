package com.example.index;

import static com.example.index.ActivityTo.doFinishAndStart;
import static com.example.index.ActivityTo.doStart;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class signin extends AppCompatActivity {
    Activity context = this;
    TextView go_register;
    EditText email_sign,password_sign;
    Button sign_bt;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        email_sign=(EditText) findViewById(R.id.email_edit);
        password_sign=(EditText) findViewById(R.id.password_edit);
        go_register=(TextView) findViewById(R.id.go_register);
        sign_bt=(Button) findViewById(R.id.sign_bt);


        /**========================登入========================**/
        sign_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                password=password_sign.getText().toString();
                email=email_sign.getText().toString();
                if(email.length() > 0 && password.length() > 0){
                    doFinishAndStart(signin.this,TPIndex.class);
                }else{
                    Toast.makeText(getApplicationContext(), "尚未輸入", Toast.LENGTH_SHORT).show();
                }


            }
        });
        /**========================跳轉註冊========================**/
        go_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doFinishAndStart(signin.this,register.class);
            }
        });
        /**下導覽列**/
        RadioGroup rbGrop = findViewById(R.id.rg_main);
        rbGrop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rbGroup, int checkedId) {
                RadioButton rb = (RadioButton) findViewById(checkedId);
                if (checkedId == R.id.tp_information){
                    doFinishAndStart(signin.this,TPIndex.class);
                }
                else if (checkedId == R.id.tp_shop){
                    doFinishAndStart(signin.this,MainActivity.class);
                }
                else if (checkedId == R.id.tp_home){
                    doFinishAndStart(signin.this,TPIndex.class);
                }
                else if (checkedId == R.id.tp_cart){
                    doFinishAndStart(signin.this,shopcar.class);
                }
                else if (checkedId == R.id.tp_user){
                    doFinishAndStart(signin.this,signin.class);
                }
            }
        });

    }
}