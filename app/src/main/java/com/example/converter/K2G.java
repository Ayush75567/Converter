package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class K2G extends AppCompatActivity {

    EditText value1;
    TextView answer1;
    Button submit1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k2_g);

        value1 = findViewById(R.id.edit2);
        answer1 = findViewById(R.id.answer1);
        submit1 = findViewById(R.id.submit1);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(value1.getText().toString().trim().equals("")){
                    Toast.makeText(K2G.this,"Please Insert Some Value",Toast.LENGTH_LONG).show();
                }else{
                    String s=value1.getText().toString();
                    double kg=Double.parseDouble(s);
                    double g=1000*kg;
                    answer1.setText("The corresponding value in Gram is "+g);
                }
            }
        });
    }
}