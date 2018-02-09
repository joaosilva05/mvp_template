package com.joaosilva.mvp.network;

import com.joaosilva.mvp.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface NetworkComponent {
    NetworkApi networkApi();
}
