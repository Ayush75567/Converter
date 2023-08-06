package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class K2M extends AppCompatActivity {

    EditText value1;
    TextView answer1;
    Button submit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k2_m);

        value1 = findViewById(R.id.edit3);
        answer1 = findViewById(R.id.answer2);
        submit1 = findViewById(R.id.submit2);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value1.getText().toString().trim().equals("")){
                    Toast.makeText(K2M.this,"Please Insert Some Value",Toast.LENGTH_LONG).show();
                }else {
                    String s=value1.getText().toString();
                    double km=Double.parseDouble(s);
                    double m=1000*km;
                    answer1.setText("The corresponding value in Meter is "+m);
                }
            }
        });
    }
}