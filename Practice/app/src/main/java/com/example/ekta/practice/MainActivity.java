package com.example.ekta.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Work work = new Work();
        Work work1 = new Work();
        new Thread(() -> {
            work.doWork();
        }).start();
        new Thread(() -> {
            work1.doWork();
        }).start();
    }
}
