package com.example.prawiraadi.sejarahislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mulk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulk);
    }
    public void back3 (View view){
        Intent intent = new Intent(this, Islam.class);
        startActivity(intent);

    }
}
