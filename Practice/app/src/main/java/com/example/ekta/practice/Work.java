package com.example.ekta.practice;

import android.util.Log;

public class Work {
    private static final String TAG = Work.class.getSimpleName();
    public void doWork(String name) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                Log.d(TAG, "doWork: " + i + " " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
