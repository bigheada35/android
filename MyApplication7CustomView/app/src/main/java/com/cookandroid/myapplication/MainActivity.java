package com.cookandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Weather> data = null;

    private WeatherAdapter adapter = null;

    private ListView lv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        data = new ArrayList<Weather>();

        data.add(new Weather("월", R.drawable.w_icon_01, "맑음"));
        data.add(new Weather("화", R.drawable.w_icon_02, "흐림"));
        data.add(new Weather("수", R.drawable.w_icon_03, "흐림/비"));
        data.add(new Weather("목", R.drawable.w_icon_04, "비"));
        data.add(new Weather("금", R.drawable.w_icon_02, "흐림"));
        data.add(new Weather("토", R.drawable.w_icon_01, "맑음"));
        data.add(new Weather("일", R.drawable.w_icon_03, "흐림/비"));

        adapter = new WeatherAdapter( MainActivity.this, R.layout.custom_layout, data);
        lv = (ListView)findViewById(R.id.lv_weather);
        lv.setAdapter(adapter);
    }
}