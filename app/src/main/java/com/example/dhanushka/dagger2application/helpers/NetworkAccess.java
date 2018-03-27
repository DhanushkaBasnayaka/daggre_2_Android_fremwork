package com.example.dhanushka.dagger2application.helpers;

import android.content.Context;
import android.net.ConnectivityManager;

import com.example.dhanushka.dagger2application.di.d.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by dhanushka on 24/10/2017.
 */
@Singleton
public class NetworkAccess {

    private static Context mContext;

    @Inject
    public NetworkAccess(@ApplicationContext Context context) {
        mContext = context;
    }

    public static boolean isNetworkAvailable() {

        boolean state = isInternetAvailable();
        if (!state) {

        }
        return state;
    }

    private static boolean isInternetAvailable() {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
