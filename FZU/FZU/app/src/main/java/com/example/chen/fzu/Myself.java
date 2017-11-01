package com.example.chen.fzu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Myself extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myself);
        getSupportActionBar().setTitle("我的");
        initView();

    }


    private RadioButton button_1;
    private RadioButton button_2;
    private RadioButton button_3;
    private RadioButton button_4;



    private void initView(){
        //找到四个按钮
        button_1 = (RadioButton) findViewById(R.id.my_ask);
        button_2 = (RadioButton) findViewById(R.id.my_answer);
        button_3 = (RadioButton) findViewById(R.id.my_praise);
        button_4 = (RadioButton) findViewById(R.id.my_look);

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
            case R.id.my_ask:
                Intent intent = new Intent(Myself.this, My_Ask.class);
                startActivity(intent);
                break;
            case R.id.my_answer:
                Intent intent1 = new Intent(Myself.this, My_Answer.class);
                startActivity(intent1);
                break;
            case R.id.my_praise:
                Intent intent2 = new Intent(Myself.this, My_Praise.class);
                startActivity(intent2);
                break;
            case R.id.my_look:
                Intent intent3 = new Intent(Myself.this, My_Look.class);
                startActivity(intent3);
                break;
            default:
                break;
        }

    }
}
