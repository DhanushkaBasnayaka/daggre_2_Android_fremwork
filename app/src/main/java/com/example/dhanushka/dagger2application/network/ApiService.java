package com.example.dhanushka.dagger2application.network;

import com.example.dhanushka.dagger2application.module.GithubRepo;
import com.example.dhanushka.dagger2application.module.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by dhanushka on 10/10/2017.
 */

public interface ApiService {

    @GET("users/{username}/repos")
    Call<List<User>> getReposForUser(@Path("username") String username);


    @GET("repositories")
    Call<List<GithubRepo>> getAllRepos();

    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);
}
