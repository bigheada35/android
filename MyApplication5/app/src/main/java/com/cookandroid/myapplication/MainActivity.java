package com.cookandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.cookandroid.myapplication.R.id.lv_week;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList= null;
    ArrayAdapter<String> adapter = null;
    ListView lv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main1);
        //setContentView(R.layout.activity_main2);
        //setContentView(R.layout.activity_main3);
        //setContentView(R.layout.activity_main4);

        //setContentView(R.layout.activity_reletive8);
        //setContentView(R.layout.activity_s_frame1);
        //setContentView(R.layout.activity_s1_table);
        //setContentView(R.layout.activity_t_calculator_layout);
        //setContentView(R.layout.activity_t_calculator_layout2);
        //setContentView(R.layout.aa_LinearLayout_orientation);
        //setContentView(R.layout.a01_linearlayout_orientation);
        setContentView(R.layout.activity_u1_listview);
        
        arrayList = new ArrayList<String>();
        arrayList.add("월");
        arrayList.add("화");
        arrayList.add("수");
        arrayList.add("목");
        arrayList.add("금");
        arrayList.add("토");
        arrayList.add("일");
                                    //MainActivity.this,//자기자신 객체를 넣어 준다.
        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayList);
        lv = (ListView)findViewById(lv_week);
        lv.setAdapter(adapter);
    }
}