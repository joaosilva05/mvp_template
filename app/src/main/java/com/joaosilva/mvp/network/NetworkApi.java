package com.joaosilva.mvp.network;

import com.joaosilva.mvp.network.models.LoginRequest;
import com.joaosilva.mvp.network.models.LoginResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

public interface NetworkApi {
    String BASE_URL = "http://demo5335140.mockable.io/";

    @POST("login")
    Observable<LoginResponse> login(@Body LoginRequest request);
}





