package com.example.dhanushka.dagger2application;

import android.app.Activity;
import android.app.Application;

import com.example.dhanushka.dagger2application.di.d.component.ApplicationComponent;
import com.example.dhanushka.dagger2application.di.d.component.DaggerApplicationComponent;
import com.example.dhanushka.dagger2application.di.d.module.ContextModule;


/**
 * Created by dhanushka on 10/10/2017.
 */

public class ProjectApplication extends Application {
    private ApplicationComponent component;

    public static ProjectApplication get(Activity activity) {
        return (ProjectApplication) activity.getApplication();

    }

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

//        component = DaggerApplicationComponent
//                .builder()
//                .applicationModule(new ApplicationModule(this))
//                .build();
//        component.inject(this);

    }

    public ApplicationComponent getcomponent() {
        return component;
    }
}
