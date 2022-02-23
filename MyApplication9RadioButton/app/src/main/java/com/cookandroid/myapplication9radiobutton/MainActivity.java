package com.cookandroid.myapplication9radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.rg_01);

        rg.setOnCheckedChangeListener(checkedChangeListner);
    }

    RadioGroup.OnCheckedChangeListener checkedChangeListner = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
            int id = radioGroup.getCheckedRadioButtonId();
            RadioButton rb = (RadioButton) findViewById(id);
            Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
/*
            switch(checkedId){
                case R.id.rb_01:
                    Toast.makeText(MainActivity.this,"서울" , Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rb_02:
                    Toast.makeText(MainActivity.this,"경기도" , Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rb_03:
                    Toast.makeText(MainActivity.this,"전라도" , Toast.LENGTH_SHORT).show();
                    break;

            }
*/
        }
    };

}