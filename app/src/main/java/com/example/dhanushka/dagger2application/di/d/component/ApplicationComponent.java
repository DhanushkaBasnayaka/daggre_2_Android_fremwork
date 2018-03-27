package com.example.dhanushka.dagger2application.di.d.component;


import com.example.dhanushka.dagger2application.di.d.ApplicationScope;
import com.example.dhanushka.dagger2application.di.d.PerActivity;
import com.example.dhanushka.dagger2application.di.d.module.ActivityModule;
import com.example.dhanushka.dagger2application.di.d.module.ApplicarionServicemodule;
import com.example.dhanushka.dagger2application.di.d.module.PicassoModule;
import com.example.dhanushka.dagger2application.helpers.NetworkAccess;
import com.example.dhanushka.dagger2application.network.ApiService;
import com.example.dhanushka.dagger2application.network.CallApi;
import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dhanushka on 10/10/2017.
 */

@Singleton
@Component(modules = {ApplicarionServicemodule.class, PicassoModule.class, ActivityModule.class})
public interface ApplicationComponent {

    Picasso getPicasso();
    ApiService getApplicatonService();
    CallApi getClasesink();
    NetworkAccess getNetworkAccess();
}
