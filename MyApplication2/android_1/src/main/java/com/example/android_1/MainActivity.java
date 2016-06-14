package com.example.android_1;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
/*
button 继承view ；view类是所有界面组织的根
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
//获取布局文件中view
    private void initView() {
        Button bt= (Button) findViewById(R.id.button1);
//        注册监听器，点击按钮是调用
        bt.setOnClickListener(new a());
        Button third= (Button) findViewById(R.id.button3);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("__j监听器无名内部类");
            }
        });
    }
    class  a implements Button.OnClickListener{

        @Override
        public void onClick(View v) {
            System.out.println("---监听器");
        }
    }
    /*
    v:就是按钮对象
     */
    public  void  click1(View view){
        System.out.println("---点击按钮");
        view.setBackgroundColor(0xff555555);
    }
}
