package com.example.dhanushka.dagger2application.component;

import com.example.dhanushka.dagger2application.ActivityModule;
import com.example.dhanushka.dagger2application.ApplicationScope;
import com.example.dhanushka.dagger2application.modueledagger2.ApplicarionServicemodule;
import com.example.dhanushka.dagger2application.modueledagger2.PicassoModule;
import com.example.dhanushka.dagger2application.network.ApiService;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by dhanushka on 10/10/2017.
 */

@ApplicationScope
@Component(modules = {ApplicarionServicemodule.class, PicassoModule.class, ActivityModule.class})
public interface ApplicationComponent {

    Picasso getPicasso();

    ApiService getApplicatonService();
//    DataManager getDataManager();

}
