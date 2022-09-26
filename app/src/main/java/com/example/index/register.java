package com.example.index;

import static com.example.index.ActivityTo.doFinishAndStart;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText email_register,password_register;
    Button register_button;
    TextView register_state;
    Activity context = this;
    String email="",password="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register_button = (Button) findViewById(R.id.member_register);
        email_register = (EditText) findViewById(R.id.Email_register_edit);
        password_register = (EditText) findViewById(R.id.Password_register_edit);
        register_state=(TextView) findViewById(R.id.register_state_text);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password=password_register.getText().toString();
                email=email_register.getText().toString();

                if (email.length() > 0 && password.length() > 0){
                    doFinishAndStart(register.this,register2.class);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "尚未輸入", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}