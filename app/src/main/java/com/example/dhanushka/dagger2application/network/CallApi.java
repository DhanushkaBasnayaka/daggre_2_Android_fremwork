package com.example.dhanushka.dagger2application.network;

import android.content.Context;
import android.util.Log;

import com.example.dhanushka.dagger2application.helpers.NetworkAccess;
import com.example.dhanushka.dagger2application.module.GithubRepo;
import com.example.dhanushka.dagger2application.module.User;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by dhanushka on 19/10/2017.
 */

public class CallApi {

    @Inject
    ApiService mSicModul;
    private Context mContext;


    public CallApi(Context context, ApiService m) {
        mContext = context;
        mSicModul = m;
    }


    public void getServercal(final GetSDPListCallback callback) {

        if (!NetworkAccess.isNetworkAvailable(mContext)) {
            callback.onFailedGetSDPList(null);
            return;
        }

        Call<List<GithubRepo>> reposCall;

        reposCall = mSicModul.getAllRepos();

        reposCall.enqueue(new Callback<List<GithubRepo>>() {
            @Override
            public void onResponse(Call<List<GithubRepo>> call, Response<List<GithubRepo>> response) {
                Log.d("rgfgfg", "gfgghrtgrthw");

            }

            @Override
            public void onFailure(Call<List<GithubRepo>> call, Throwable t) {

            }
        });


//        apiService.getAllRepos()
//                .enqueue(new Callback<SDPListResponse>() {
//                    @Override
//                    public void onResponse(Call<SDPListResponse> call, Response<SDPListResponse> response) {
//                        if (response.code() == Constant.SUCCESS_CODE) {
//                            mSDP.save(response.body().result);
////                            callback.onSuccessGetSDPList(response.body().result);
//                        } else {
////                            callback.onFailedGetSDPList(ErrorHandler.getApiErrorMessage(response));
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<SDPListResponse> call, Throwable t) {
//                        callback.onFailedGetSDPList(Constant.BAD_REQUEST);
//                    }
//                });


    }

    public interface GetSDPListCallback {
        void onSuccessGetSDPList(List<User> sdpList);

        void onFailedGetSDPList(String message);
    }
}