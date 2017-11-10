package com.example.ekta.evaluation2017.ui.main;

import android.os.Bundle;

import com.example.ekta.evaluation2017.R;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.DaggerActivity;

public class MainActivity extends DaggerActivity {

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
