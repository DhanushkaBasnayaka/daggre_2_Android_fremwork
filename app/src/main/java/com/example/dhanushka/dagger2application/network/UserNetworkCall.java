package com.example.dhanushka.dagger2application.network;

import android.content.Context;
import android.util.Log;

import com.example.dhanushka.dagger2application.component.ApplicationComponent;
import com.example.dhanushka.dagger2application.module.GithubRepo;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by dhanushka on 12/10/2017.
 */

public class UserNetworkCall {

    @Inject
    ApiService apiService;
    private Context mContext;

    @Inject
    public UserNetworkCall(Context context, ApplicationComponent mApplicationComponent) {
        apiService = mApplicationComponent.getApplicatonService();
    }


    public void getServercal() {

        Call<List<GithubRepo>> reposCall;

        reposCall = apiService.getAllRepos();

        reposCall.enqueue(new Callback<List<GithubRepo>>() {
            @Override
            public void onResponse(Call<List<GithubRepo>> call, Response<List<GithubRepo>> response) {
                Log.d("rgfgfg", "gfgghrtgrthw");

            }

            @Override
            public void onFailure(Call<List<GithubRepo>> call, Throwable t) {

            }
        });
    }

}
