package com.example.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private Button btnpraymh370;
    private ImageView tupian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnpraymh370=findViewById(R.id.btnpraymh370);
    }
}
