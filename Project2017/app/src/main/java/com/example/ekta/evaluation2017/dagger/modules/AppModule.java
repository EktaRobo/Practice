package com.example.ekta.evaluation2017.dagger.modules;

import android.app.Application;
import android.content.Context;

import com.example.ekta.evaluation2017.dagger.qualifiers.ApplicationContext;
import com.example.ekta.evaluation2017.dagger.scopes.ApplicationScope;
import com.google.gson.Gson;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ekta on 4/11/17.
 */
@Module(includes = {AppModule.Declaration.class})
public class AppModule {
    @Module
    public interface Declaration {
        @Binds
        @ApplicationContext
        Context mContext(Application application);
    }

    @Provides
    @ApplicationScope
    public Gson provideGson() {
        return new Gson();
    }
}
