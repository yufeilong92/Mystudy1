package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i =0;
    public void change5(View view){
        TextView tv=(TextView) findViewById(R.id.hw);
        //改变显示的字符串
//		tv.setText("abc");
        tv.setText(""+i++);

    }
}
