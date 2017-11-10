package com.example.ekta.evaluation2017.dagger.modules;

import com.example.ekta.evaluation2017.ui.main.MainActivity;
import com.example.ekta.evaluation2017.dagger.scopes.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by ekta on 4/11/17.
 */
@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    @ActivityScope
    abstract MainActivity bindMainActivity();

    /*@ContributesAndroidInjector
    abstract DetailActivity bindMainDetailActivity();*/
}
