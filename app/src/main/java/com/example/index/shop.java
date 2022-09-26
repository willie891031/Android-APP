package com.example.index;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class shop extends AppCompatActivity {
    Button b1;
    Button b2,buy;
    TextView q1,q2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        q1 = (TextView) findViewById(R.id.q1);
        q2 = (TextView) findViewById(R.id.q2);
        Spinner a1 = (Spinner) findViewById(R.id.a1);
        String aa1 = a1.getSelectedItem().toString();

        //String A1 = a1.getSelectedItem().toString();
        int i = Integer.parseInt(aa1);
        int x = Integer.parseInt(q1.getText().toString());
        //int y = Integer.parseInt(q2.getText().toString());
        /**===================跳轉結帳===================**/
        b1=(Button) findViewById(R.id.buy);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i > x){
                    Toast.makeText(getApplicationContext(), "庫存數量不足", Toast.LENGTH_SHORT).show();
                }
                /*else if(x == 0 || y == 0){
                    Toast.makeText(getApplicationContext(), "庫存數量不足", Toast.LENGTH_SHORT).show();
                }*/
                else {
                    Intent intent = new Intent();
                    intent.setClass(shop.this, filee.class);
                    startActivity(intent);
                }
            }
        });
        /**===================跳轉購物車===================**/
        b2=(Button) findViewById(R.id.shopcar);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(shop.this, shopcar.class);
                startActivity(intent);
            }
        });

    }
}