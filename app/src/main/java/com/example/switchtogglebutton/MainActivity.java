package com.example.switchtogglebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.widget.*;
import android.view.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch sw;
    ToggleButton tb;
    Button btn;
    LinearLayout ll;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw=findViewById(R.id.sw);
        tb=findViewById(R.id.tb);
        btn=findViewById(R.id.btn);
        ll=findViewById(R.id.ll);
    }

    public void onClick(View view) {
        if(!sw.isChecked()){
            if(!tb.isChecked()) ll.setBackgroundColor(Color.rgb(255,127,0));
            if(tb.isChecked()) ll.setBackgroundColor(Color.YELLOW);
        }
        if(sw.isChecked()){
            if(!tb.isChecked()) ll.setBackgroundColor(Color.GREEN);
            if(tb.isChecked()) ll.setBackgroundColor(Color.CYAN);
        }
    }
}