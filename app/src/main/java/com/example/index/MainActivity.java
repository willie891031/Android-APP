package com.example.index;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //需要適配器
    private String[] titles = {"小黃瓜", "青油菜", "黑木耳", "青蔥", "青仁黑豆", "蔡杰安"};
    private String[] prices = {"170元", "150元", "480元", "700元", "600元", "50摳"};
    //圖片集合
    private int[] icons = {R.drawable.cucumber, R.drawable.rape, R.drawable.blackfungus, R.drawable.shallots, R.drawable.blackbeans, R.drawable.tsai};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化listview控件
        ListView listView = findViewById(R.id.lv);
        //創建一個Adapter的實例
        MyBaseAdapter mAdapter = new MyBaseAdapter();
        //加載適配器
        listView.setAdapter(mAdapter);

        RadioGroup rbGrop = findViewById(R.id.rg_main);
        rbGrop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rbGroup, int checkedId) {
                RadioButton rb = (RadioButton) findViewById(checkedId);
                if (checkedId == R.id.tp_information){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TPIndex.class);
                    MainActivity.this.finish();
                    MainActivity.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_shop){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TPIndex.class);
                    MainActivity.this.finish();
                    MainActivity.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_home){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TPIndex.class);
                    MainActivity.this.finish();
                    MainActivity.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_cart){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TPIndex.class);
                    MainActivity.this.finish();
                    MainActivity.this.startActivity(intent);
                }
                else if (checkedId == R.id.tp_user){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TPIndex.class);
                    MainActivity.this.finish();
                    MainActivity.this.startActivity(intent);
                }
            }
        });
    }

    class MyBaseAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int position) {
            return titles[position];        //返回Item數據對象
        }

        @Override
        public long getItemId(int position) {
            return position;                //返回Item id
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = View.inflate(MainActivity.this, R.layout.list_item, null);
                holder = new ViewHolder();
                holder.title = convertView.findViewById(R.id.title);
                holder.price = convertView.findViewById(R.id.price);
                holder.iv = convertView.findViewById(R.id.iv);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.title.setText(titles[position]);
            holder.price.setText(prices[position]);
            holder.iv.setImageResource(icons[position]);
            return convertView;
        }
    }

    class ViewHolder {
        TextView title;
        TextView price;
        ImageView iv;
    }
}