package com.example.prawiraadi.sejarahislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Islam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islam);
    }
    public void Massage1 (View view){
        Intent intent = new Intent(this, yasiin.class);
        startActivity(intent);

    }
    public void Massage2 (View view){
        Intent intent = new Intent(this, waqiah.class);
        startActivity(intent);

    }
    public void Massage3 (View view){
        Intent intent = new Intent(this, mulk.class);
        startActivity(intent);

    }
    }

