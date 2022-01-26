package com.example.intent001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_main_activity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initView();
               // initVieww();
            }
        });
    }
    private  void initView(){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Sherzod  21 ");
//        intent.putExtra("age",21);
        startActivity(intent);
    }
//    private  void initVieww(){
//        Intent intent = new Intent(this,SecondActivity.class);
//        intent.putExtra("age",21);
//        startActivity(intent);
//    }

}
