package com.example.dhanushka.dagger2application;

import android.app.Activity;
import android.app.Application;

import com.example.dhanushka.dagger2application.component.ApplicationComponent;
import com.example.dhanushka.dagger2application.component.DaggerApplicationComponent;
import com.example.dhanushka.dagger2application.helpers.NetworkAccess;
import com.example.dhanushka.dagger2application.modueledagger2.ContextModule;
import com.example.dhanushka.dagger2application.network.ApiService;
import com.example.dhanushka.dagger2application.network.CallApi;
import com.squareup.picasso.Picasso;

/**
 * Created by dhanushka on 10/10/2017.
 */

public class ProjectApplication extends Application {
    private ApplicationComponent component;
    private ApiService apiService;
    private Picasso picasso;
    private CallApi mCallApi;
    private NetworkAccess mNetworkAccess;

    public static ProjectApplication get(Activity activity) {
        return (ProjectApplication) activity.getApplication();

    }

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        apiService = component.getApplicatonService();
        picasso = component.getPicasso();
        mCallApi = component.getClasesink();
        mNetworkAccess = component.getNetworkAccess();
    }

    public ApplicationComponent getcomponent() {
        return component;
    }
}
