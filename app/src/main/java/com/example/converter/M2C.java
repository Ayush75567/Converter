package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class M2C extends AppCompatActivity {

    EditText value;
    TextView answer;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2_c);

        value=findViewById(R.id.edit1);
        submit=findViewById(R.id.submit);
        answer=findViewById(R.id.answer);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (value.getText().toString().trim().equals("")){
                    Toast.makeText(M2C.this,"Please Insert Some Value",Toast.LENGTH_LONG).show();
                }else {
                    String s=value.getText().toString();
                    double m=Double.parseDouble(s);
                    double cm=100*m;
                    answer.setText("The corresponding value in centimeter is "+cm);
                }
            }
        });
    }
}