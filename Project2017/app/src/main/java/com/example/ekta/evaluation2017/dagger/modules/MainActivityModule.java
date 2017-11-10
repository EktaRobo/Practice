package com.example.ekta.evaluation2017.dagger.modules;

import android.content.Context;

import com.example.ekta.evaluation2017.dagger.qualifiers.ActivityContext;
import com.example.ekta.evaluation2017.dagger.scopes.FragmentScope;
import com.example.ekta.evaluation2017.ui.main.MainActivity;
import com.example.ekta.evaluation2017.ui.main.MainFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by ekta on 4/11/17.
 */
@Module(includes = MainActivityModule.MainFragmentProvider.class) //This is how we inform the modules about the inner interfaces or class
abstract class MainActivityModule {
    @Binds
    @ActivityContext
    abstract Context activityContet(MainActivity mainActivity);



    @Module
    public interface MainFragmentProvider {
        @FragmentScope
        @ContributesAndroidInjector(modules = MainFragmentModule.class)
        MainFragment bindMainActivity();
    }


}
