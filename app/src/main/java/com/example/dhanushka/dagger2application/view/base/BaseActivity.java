package com.example.dhanushka.dagger2application.view.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dhanushka.dagger2application.ProjectApplication;
import com.example.dhanushka.dagger2application.di.d.component.ActivityComponent;
import com.example.dhanushka.dagger2application.di.d.component.ApplicationComponent;
import com.example.dhanushka.dagger2application.di.d.component.DaggerActivityComponent;
import com.example.dhanushka.dagger2application.di.d.module.ActivityModule;
import com.example.dhanushka.dagger2application.network.ApiService;
import com.example.dhanushka.dagger2application.network.CallApi;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    protected Picasso picasso;

    @Inject
   protected CallApi mDataManager;

    @Inject
    protected ApiService mSicModul;


    private ActivityComponent activityComponent;


    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(ProjectApplication.get(this).getcomponent())
                    .build();
        }
        return activityComponent;
    }

//    public ApplicationComponent getActivityComponent() {
//        if (activityComponent == null) {
//             activityComponent = ((ProjectApplication) getApplication()).getcomponent();
//        }
//
//
//        return activityComponent;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }
}
