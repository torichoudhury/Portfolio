package com.example.portfoliofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void activity1(View v){


        Intent intent= new Intent(this,Screen2.class);

        startActivity(intent);
    }

    public void activity2(View v){
        Intent intent= new Intent(this,Screen3.class);

        startActivity(intent);
    }
}