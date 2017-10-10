package com.example.dhanushka.dagger2application.modueledagger2;

import android.content.Context;

import com.example.dhanushka.dagger2application.ApplicationContext;
import com.example.dhanushka.dagger2application.ApplicationScope;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by dhanushka on 10/10/2017.
 */
@Module(includes = {ContextModule.class, NetworkModule.class})
public class PicassoModule {

    @Provides
    @ApplicationScope
    public Picasso picasso(@ApplicationContext Context context, OkHttp3Downloader okHttp3Downloader) {
        return new Picasso.Builder(context)
                .downloader(okHttp3Downloader)
                .build();
    }


    @Provides
    @ApplicationScope
    public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient) {
        return new OkHttp3Downloader(okHttpClient);
    }
}
