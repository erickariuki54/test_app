package com.GISproject.test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        map = (Button) findViewById(R.id.map_bt);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openNewActivity();

            }
        });
    }
    public void openNewActivity(){
        Intent bt_map = new Intent(SecondActivity.this, MapsActivity.class);
        startActivity(bt_map);
    }

}