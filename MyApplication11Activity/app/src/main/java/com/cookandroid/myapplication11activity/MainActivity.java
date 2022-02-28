package com.cookandroid.myapplication11activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        Uri uri= null;
        Intent intent = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


/// 암시적 인턴트 테스트 --s--
/*
        setContentView(R.layout.activity_intent);
        Button bt_dial = (Button) findViewById(R.id.bt_dial);
        bt_dial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "Dial", Toast.LENGTH_SHORT).show();
                uri = Uri.parse("tel:01012345678");
                intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
*/
/// 암시적 인턴트 테스트 --e--
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "1onCreate()");
        Button btn = (Button) findViewById(R.id.bt_main);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("숫자", 12345);
                intent.putExtra("문자", "문자열전달");

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