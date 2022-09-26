package com.example.index;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import static com.example.index.ActivityTo.doFinishAndStart;

import java.util.Calendar;

public class register2 extends AppCompatActivity {

    Calendar nowdate = Calendar.getInstance();
    int mYear = nowdate.get(Calendar.YEAR);
    int mMonth = nowdate.get(Calendar.MONTH);
    int mDay = nowdate.get(Calendar.DAY_OF_MONTH);
    EditText name,phone,city,region,address;
    TextView date;
    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        name=(EditText) findViewById(R.id.member_name_edit);
        phone=(EditText) findViewById(R.id.phone_edit);
        city=(EditText)findViewById(R.id.city_edit);
        region=(EditText)findViewById(R.id.region_edit);
        address=(EditText)findViewById(R.id.address_edit);
        date=(TextView) findViewById(R.id.mb_date);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_sex);
        button=(Button)findViewById(R.id.sign_out);

        // 取得SharedPreference
        SharedPreferences getPrefs = PreferenceManager
                .getDefaultSharedPreferences(getBaseContext());
        // 取得Key名稱為version的資料
        String email = getPrefs.getString("email", "");
        date.setText(mYear+"/"+mMonth+"/"+mDay);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(register2.this, onDateSetListener, mYear, mMonth, mDay).show();            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int gender = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(gender);
                doFinishAndStart(register2.this,signin.class);
            }
        });
    }

    private DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            int mYear = year;
            int mMonth = monthOfYear+1;
            int mDay = dayOfMonth;

            // TextView date_textview = (TextView) findViewById(R.id.t4);
            String days,da;
            days = mYear + "年" + mMonth + "月" + mDay + "日";
            da=String.valueOf(mYear+"/"+mMonth+"/"+mDay);
            date.setText(da);
        }
    };
}