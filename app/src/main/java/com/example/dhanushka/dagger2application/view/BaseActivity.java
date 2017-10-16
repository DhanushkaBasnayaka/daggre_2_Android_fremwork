package com.example.dhanushka.dagger2application.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dhanushka.dagger2application.ProjectApplication;
import com.example.dhanushka.dagger2application.component.ActivityComponent;
import com.example.dhanushka.dagger2application.component.ApplicationComponent;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    Picasso picasso;


    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject(((ProjectApplication) getApplication()).getcomponent());

    }

    protected abstract void inject(ApplicationComponent component);

}
