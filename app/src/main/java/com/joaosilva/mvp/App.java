package com.joaosilva.mvp;

import android.app.Application;

import com.joaosilva.mvp.network.DaggerNetworkComponent;
import com.joaosilva.mvp.network.NetworkComponent;
import com.joaosilva.mvp.network.NetworkModule;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

public class App extends Application {

    private NetworkComponent mNetworkComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetworkComponent = DaggerNetworkComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }

    public NetworkComponent getNetworkComponent() {
        return mNetworkComponent;
    }
}
