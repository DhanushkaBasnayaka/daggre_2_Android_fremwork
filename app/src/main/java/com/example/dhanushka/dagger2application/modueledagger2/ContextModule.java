package com.example.dhanushka.dagger2application.modueledagger2;

import android.content.Context;

import com.example.dhanushka.dagger2application.ApplicationContext;
import com.example.dhanushka.dagger2application.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dhanushka on 10/10/2017.
 */

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context context() {
        return context;
    }

}
