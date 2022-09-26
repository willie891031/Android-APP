package com.example.index;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.index.ActivityTo.doFinishAndStart;

public class member extends AppCompatActivity {
    TextView name,sex,phone,date,address;
    Button sign_out;
    String tmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        name=(TextView) findViewById(R.id.mb_name);
        sex=(TextView) findViewById(R.id.mb_sex);
        phone=(TextView) findViewById(R.id.mb_phone);
        date=(TextView) findViewById(R.id.mb_date);
        address=(TextView) findViewById(R.id.mb_address);
        sign_out=(Button) findViewById(R.id.sign_out);
        // 取得SharedPreference
        SharedPreferences getPrefs = PreferenceManager
                .getDefaultSharedPreferences(getBaseContext());

        String email_sp = getPrefs.getString("email", "");


        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 取得Editor
                SharedPreferences.Editor editor = getPrefs.edit();
                // 移除version
                editor.remove("email");
                // 套用變更
                editor.apply();
                doFinishAndStart(member.this,TPIndex.class);
            }
        });



    }
}