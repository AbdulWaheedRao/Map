package com.example.map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class startactivity extends AppCompatActivity {
   AppCompatButton mamu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity);
        mamu=findViewById(R.id.mamu);
        mamu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(startactivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}