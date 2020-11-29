package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button=(Button)findViewById(R.id.point_登录);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"登录中,请稍后~~~~",
                        Toast.LENGTH_SHORT).show();
            }
        });
        TextView text=(TextView) findViewById(R.id.point_register);
        text.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        TextView text1=(TextView) findViewById(R.id.land_tencent);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"Sorry,腾讯微博停止使用",
                        Toast.LENGTH_SHORT).show();
            }
        });
        TextView text2=(TextView) findViewById(R.id.land_sina);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://weibo.com/"));
                startActivity(intent);
                Toast.makeText(FirstActivity.this,"正在跳转~~~",
                        Toast.LENGTH_SHORT).show();
            }
        });
        CheckBox checkBox=(CheckBox) findViewById(R.id.check_box);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            EditText editText=(EditText) findViewById(R.id.input_key);
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText.setTransformationMethod(null);
                }
            }
    });
    }
}