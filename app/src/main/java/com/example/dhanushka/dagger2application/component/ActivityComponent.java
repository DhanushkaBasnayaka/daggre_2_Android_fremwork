package com.example.dhanushka.dagger2application.component;

import com.example.dhanushka.dagger2application.ActivityModule;
import com.example.dhanushka.dagger2application.MainActivity;
import com.example.dhanushka.dagger2application.PerActivity;

import dagger.Component;

/**
 * Created by dhanushka on 10/10/2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
