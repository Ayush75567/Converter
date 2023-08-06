package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button m2c,k2g,k2m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m2c=findViewById(R.id.m2c);
        k2g=findViewById(R.id.k2g);
        k2m=findViewById(R.id.k2m);

        m2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,M2C.class);
                startActivity(intent);
            }
        });

        k2g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,K2G.class);
                startActivity(intent1);
            }
        });

        k2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent2=new Intent(MainActivity.this,K2M.class);
                startActivity(intent2);
            }
        });

    }
}