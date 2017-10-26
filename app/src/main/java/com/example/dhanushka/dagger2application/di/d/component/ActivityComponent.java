package com.example.dhanushka.dagger2application.di.d.component;

import com.example.dhanushka.dagger2application.di.d.PerActivity;
import com.example.dhanushka.dagger2application.di.d.module.ActivityModule;
import com.example.dhanushka.dagger2application.view.base.BaseActivity;

import dagger.Component;

/**
 * Created by dhanushka on 10/10/2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(BaseActivity baseActivity);
}
