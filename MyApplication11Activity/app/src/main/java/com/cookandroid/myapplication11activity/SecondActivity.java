package com.cookandroid.myapplication11activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("MainActivity", "2onCreate()");
        Button btn = (Button)findViewById(R.id.bt_second);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // 방법 1
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

                //방법 2
                //finish();
            }
        });

    }

    @Override
    protected void onStart(){
        Log.i("MainActivity", "2onStart()");
        super.onStart();
    }
    @Override
    protected void onResume(){
        Log.i("MainActivity", "2onResume()");
        super.onResume();
    }
    @Override
    protected void onDestroy(){
        Log.i("MainActivity", "2onDestroy()");
        super.onDestroy();
    }
}