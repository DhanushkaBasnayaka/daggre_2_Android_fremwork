package com.example.dhanushka.dagger2application.helpers;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by dhanushka on 24/10/2017.
 */

public class NetworkAccess {

    private static Context mContext;

    public NetworkAccess(Context context) {
        mContext = context;
    }

    public static boolean isNetworkAvailable(final Context context) {
        mContext = context;
        boolean state = isInternetAvailable();
        if (!state) {
            //Toast.makeText(mContext, R.string.no_internet, Toast.LENGTH_LONG).show();
        }
        return state;
    }

    private static boolean isInternetAvailable() {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
