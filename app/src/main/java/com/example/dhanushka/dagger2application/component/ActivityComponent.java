package com.example.dhanushka.dagger2application.component;

import com.example.dhanushka.dagger2application.ActivityModule;
import com.example.dhanushka.dagger2application.PerActivity;
import com.example.dhanushka.dagger2application.network.CallApi;
import com.example.dhanushka.dagger2application.view.BaseActivity;

import dagger.Component;

/**
 * Created by dhanushka on 10/10/2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(BaseActivity baseActivity);

    void inject(CallApi mCallApi);
}
