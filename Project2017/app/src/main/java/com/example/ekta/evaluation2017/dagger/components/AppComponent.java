package com.example.ekta.evaluation2017.dagger.components;

import android.app.Application;

import com.example.ekta.evaluation2017.application.App;
import com.example.ekta.evaluation2017.dagger.modules.ActivityBuilderModule;
import com.example.ekta.evaluation2017.dagger.modules.AppModule;
import com.example.ekta.evaluation2017.dagger.modules.GlideModule;
import com.example.ekta.evaluation2017.dagger.modules.RetrofitModule;
import com.example.ekta.evaluation2017.dagger.scopes.ApplicationScope;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by ekta on 4/11/17.
 */
@ApplicationScope
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBuilderModule.class,
        AppModule.class,
        RetrofitModule.class,
        GlideModule.class

})
public interface AppComponent {

    void inject(App app);


    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
