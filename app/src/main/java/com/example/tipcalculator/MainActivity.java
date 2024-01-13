package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText billamt;
Button fifteen,eighteen,twenty;
TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    void  init(){
        billamt=findViewById(R.id.billamt);
        fifteen=findViewById(R.id.fifteeen);
        eighteen=findViewById(R.id.eighteen);
        twenty=findViewById(R.id.twenty);
        total=findViewById(R.id.total);


        total.setText("Tip:$"+0.00+" Total Bill:$"+0.00);
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float amt=Float.parseFloat(billamt.getText().toString());
                float tip=(amt*15)/100;
                float totalamt=amt+tip;
                String billamt="Tip: $"+tip+", Total Bill: $"+totalamt;
                total.setText(billamt);
            }
        });
        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float amt=Float.parseFloat(billamt.getText().toString());
                float tip=(amt*18)/100;
                float totalamt=amt+tip;
                String billamt="Tip: $"+tip+", Total Bill: $"+totalamt;
                total.setText(billamt);
            }
        });
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float amt=Float.parseFloat(billamt.getText().toString());
                float tip=(amt*20)/100;
                float totalamt=amt+tip;
                String billamt="Tip:$"+tip+", Total Bill: $"+totalamt;
                total.setText(billamt);
            }
        });
    }
}