package com.example.newtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView a = new TextView(this);
        a.setText("Hello World, Home, Github, Jenkins, vivify, Sonaqube and Slack");
        setContentView(a);
    }
}
