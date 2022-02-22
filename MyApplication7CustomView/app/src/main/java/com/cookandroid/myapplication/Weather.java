package com.cookandroid.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Weather {
    private String day;
    private int icon;
    private String comment;

    public Weather(String day, int icon, String comment){
        this.comment = comment;
        this.icon = icon;
        this.day = day;
    }

    public String getDay(){
        return day;
    }

    public int getIcon() {
        return icon;
    }

    public String getComment() {
        return comment;
    }
}