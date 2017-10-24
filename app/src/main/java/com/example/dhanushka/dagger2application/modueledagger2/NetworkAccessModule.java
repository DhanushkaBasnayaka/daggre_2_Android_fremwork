package com.example.dhanushka.dagger2application.modueledagger2;

import android.content.Context;

import com.example.dhanushka.dagger2application.ApplicationContext;
import com.example.dhanushka.dagger2application.ApplicationScope;
import com.example.dhanushka.dagger2application.helpers.NetworkAccess;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhanushka on 24/10/2017.
 */
@Module(includes = {ContextModule.class})
public class NetworkAccessModule {

    @Provides
    @ApplicationScope
    public NetworkAccess mNetworkAccess(@ApplicationContext Context context) {
        return new NetworkAccess(context);
    }
}
