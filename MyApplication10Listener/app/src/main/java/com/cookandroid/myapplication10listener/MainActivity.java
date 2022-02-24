package com.cookandroid.myapplication10listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout rl;
    Button bt;
    EditText et;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //첫번째 방법
        rl = (LinearLayout)findViewById(R.id.rl_layout);
        rl.setOnLongClickListener(longClickListener);

        //2번째 방법
        rl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "숏클클릭", Toast.LENGTH_SHORT).show();
            }
        });

        bt = (Button)findViewById(R.id.bt_01);

        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, " 클릭 버턴1", Toast.LENGTH_SHORT).show();
            }
        });
//
//   이거는 왜 에러나지??
//        bt.setOnLongClickListener(new View.OnLongClickListener(){
//            @Override
//            public void onClick(View view){
//                Toast.makeText(MainActivity.this, "롱 클릭 버턴2", Toast.LENGTH_SHORT).show();
//            }
//        });

        et = (EditText)findViewById(R.id.et_01);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.i("텍스트_텍스트", "before 변화 되었음");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.i("텍스트_텍스트", "텍스트 변화 되었음");
                Toast.makeText(MainActivity.this, " onTextChanged", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.i("텍스트_텍스트", "after 변화 되었음");
            }
        });


        iv = (ImageView)findViewById(R.id.iv_01);
        iv.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent event){
                Toast.makeText(MainActivity.this, "iv_onTouch()", Toast.LENGTH_SHORT).show();
            }
        });


    }



    View.OnLongClickListener longClickListener = new View.OnLongClickListener(){
        @Override
      public boolean onLongClick(View view){
          Toast.makeText(MainActivity.this, "롱클릭", Toast.LENGTH_SHORT).show();
          return false;
      }
    };

}