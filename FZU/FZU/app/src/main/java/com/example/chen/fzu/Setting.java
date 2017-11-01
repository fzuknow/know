package com.example.chen.fzu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

public class Setting extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getSupportActionBar().setTitle("设置");
        initView();
    }

    private RadioButton button_1;
    private RadioButton button_2;
    private RadioButton button_3;
    private RadioButton button_4;


    private void initView() {
        //找到四个按钮
        button_1 = (RadioButton) findViewById(R.id.account_information);
        button_2 = (RadioButton) findViewById(R.id.Safe);
        button_3 = (RadioButton) findViewById(R.id.noticeSet);
        button_4 = (RadioButton) findViewById(R.id.Exit);

        //设置按钮点击监听
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
    }

    //点击事件处理
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.account_information:
                Intent intent = new Intent(Setting.this, Account_Information.class);
                startActivity(intent);
                break;
            case R.id.Safe:
                Intent intent1 = new Intent(Setting.this, Privacy_Security.class);
                startActivity(intent1);
                break;
            case R.id.noticeSet:
                Intent intent2 = new Intent(Setting.this, Natification_Management.class);
                startActivity(intent2);
                break;
            case R.id.Exit:
                Intent intent3 = new Intent(Setting.this, Login.class);
                startActivity(intent3);
                break;
            default:
                break;
        }

    }


}
