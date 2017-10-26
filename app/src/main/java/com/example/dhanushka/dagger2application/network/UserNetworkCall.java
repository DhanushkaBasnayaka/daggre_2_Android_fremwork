package com.example.dhanushka.dagger2application.network;

import android.content.Context;

import com.example.dhanushka.dagger2application.di.d.ApplicationContext;
import com.example.dhanushka.dagger2application.di.d.ApplicationScope;
import com.example.dhanushka.dagger2application.di.d.module.ContextModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhanushka on 12/10/2017.
 */
@Module(includes = {ContextModule.class})
public class UserNetworkCall {


    @Provides
    @ApplicationScope
    public Context apiService(@ApplicationContext Context context) {

        return context;
    }


}
