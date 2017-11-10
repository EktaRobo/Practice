package com.example.ekta.evaluation2017.application;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.example.ekta.evaluation2017.dagger.components.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import retrofit2.Retrofit;

/**
 * Created by ekta on 4/11/17.
 */

public class App extends Application implements HasActivityInjector {
    private static final String TAG = App.class.getSimpleName();

    @Inject
    DispatchingAndroidInjector<Activity> mActivityDispatchingAndroidInjector;
    @Inject
    Retrofit mRetrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().application(this).build().inject(this);
        Log.d(TAG, "onCreate: started");
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mActivityDispatchingAndroidInjector;
    }
}
