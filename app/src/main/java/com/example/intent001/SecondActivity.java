package com.example.intent001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
       // initVieww();
    }
    private void initView(){

        Intent intent = getIntent();
        TextView tv_second = findViewById(R.id.tv_hello_academy);
        String name = intent.getStringExtra("name");
        tv_second.setText(name);
//        TextView tv_secondpdp = findViewById(R.id.tv_hello_pdp);
//        int age = intent.getIntExtra("age",21);
//        tv_secondpdp.setText(age);
    }
//    private void initVieww(){
//        TextView tv_secondpdp = findViewById(R.id.tv_hello_pdp);
//        int age = getIntent().getIntExtra("age",21);
//        tv_secondpdp.setText(age);
//    }
}