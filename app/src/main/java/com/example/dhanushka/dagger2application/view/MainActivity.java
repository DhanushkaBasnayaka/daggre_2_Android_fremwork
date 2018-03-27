package com.example.dhanushka.dagger2application.view;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.dhanushka.dagger2application.R;
import com.example.dhanushka.dagger2application.di.d.component.ApplicationComponent;
import com.example.dhanushka.dagger2application.network.ApiService;
import com.example.dhanushka.dagger2application.network.CallApi;
import com.example.dhanushka.dagger2application.network.model.User;
import com.example.dhanushka.dagger2application.view.base.BaseActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity implements CallApi.GetSDPListCallback {


    @BindView(R.id.image)
    ImageView imageiew;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        picasso.load("http://ecx.images-amazon.com/images/I/31daei1hJ8L._SL500_.jpg")
//                .placeholder(R.drawable.ic_launcher_background)
//                .into(imageiew);

        mDataManager.getServercal(this);

    }

//    @Override
//    protected void inject(ApplicationComponent component) {
//        this.mSicModul = component.getApplicatonService();
//        this.mDataManager = component.getClasesink();
//
//    }

    @Override
    public void onSuccessGetSDPList(List<User> sdpList) {

    }

    @Override
    public void onFailedGetSDPList(String message) {

    }
}
