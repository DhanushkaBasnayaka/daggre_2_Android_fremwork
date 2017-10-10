package com.example.dhanushka.dagger2application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dhanushka.dagger2application.component.ActivityComponent;


public class MainActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;
//    public ActivityComponent getActivityComponent() {
//        if (activityComponent == null) {
//            activityComponent = DaggerActivityComponent.builder()
//                    .activityModule(new ActivityModule(this))
//                    .applicationComponent(ProjectApplication.get(this).getcomponent())
//                    .build();
//        }
//        return activityComponent;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getActivityComponent().inject(this);


    }
}
