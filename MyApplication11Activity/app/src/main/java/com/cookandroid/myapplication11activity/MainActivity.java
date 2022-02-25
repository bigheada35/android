package com.cookandroid.myapplication11activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "1onCreate()");
        Button btn = (Button) findViewById(R.id.bt_main);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart(){
        Log.i("MainActivity", "1onStart()");
        super.onStart();
    }
    @Override
    protected void onResume(){
        Log.i("MainActivity", "1onResume()");
        super.onResume();
    }
    @Override
    protected void onDestroy(){
        Log.i("MainActivity", "1onDestroy()");
        super.onDestroy();
    }
}