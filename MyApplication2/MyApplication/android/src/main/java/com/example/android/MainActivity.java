package com.example.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btngetmoney;//关联到activity的按键
    private TextView tvgetmoney;
    private Button btnlostmoney;
    private int money = 0;
    private EditText etgomoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngetmoney=(Button)findViewById(R.id.btngetmoney);//得到activity的内容
        tvgetmoney=(TextView)findViewById(R.id.textView1);//得到activity的内容
        btnlostmoney=(Button)findViewById(R.id.textView2);
        etgomoney= (EditText) findViewById(R.id.etgomoney);
//       所有都强转转换
//        通过监听事件点一次执行一次


        btngetmoney.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String  st=etgomoney.getText().toString().trim();
                int it=Integer.parseInt(st);
                if(it==money){
                    Toast.makeText(MainActivity.this,"您经过努力达成目标",Toast.LENGTH_SHORT).show();
                }else {
                money++;
                    tvgetmoney.setText("哈哈，通过点击鼠标轻易赚了"+(money)+"元");
                }

            }
        });
        btnlostmoney.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

               if(money==0){
//                   提示用户
//                   提示toast.maketext(上下文，提示内容，显示多久）
                   Toast.makeText(MainActivity.this,"你已经破产了!",Toast.LENGTH_SHORT).show();
                   tvgetmoney.setText("你已经没有钱了");
               }else{
                   money--;
                   tvgetmoney.setText("哈哈，我通过点击鼠标赚的"+(money)+"元");
               }
            }
        });
    }
}
