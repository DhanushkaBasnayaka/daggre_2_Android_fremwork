package com.example.dhanushka.dagger2application.view;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.dhanushka.dagger2application.R;
import com.example.dhanushka.dagger2application.component.ApplicationComponent;
import com.example.dhanushka.dagger2application.network.UserNetworkCall;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {


    @BindView(R.id.image)
    ImageView imageiew;

    @Inject
    UserNetworkCall mDataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        picasso.load("http://ecx.images-amazon.com/images/I/31daei1hJ8L._SL500_.jpg")
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageiew);


        mDataManager.getServercal();

    }

    @Override
    protected void inject(ApplicationComponent component) {
        this.picasso = component.getPicasso();
//        this.apiService = component.getApplicatonService();
    }
}
