package com.example.dhanushka.dagger2application.di.d.module;

import android.content.Context;

import com.example.dhanushka.dagger2application.di.d.ApplicationContext;
import com.example.dhanushka.dagger2application.di.d.ApplicationScope;
import com.example.dhanushka.dagger2application.network.ApiService;
import com.example.dhanushka.dagger2application.network.CallApi;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhanushka on 24/10/2017.
 */
@Module(includes = {ContextModule.class, ApplicarionServicemodule.class})
public class SicModul {

    @Provides
    @ApplicationScope
    public CallApi mCallApi(@ApplicationContext Context context, ApiService mApiService) {
        return new CallApi(context, mApiService);
    }
}
