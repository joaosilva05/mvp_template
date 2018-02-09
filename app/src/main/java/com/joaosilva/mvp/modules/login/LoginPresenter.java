package com.joaosilva.mvp.modules.login;

import com.joaosilva.mvp.network.NetworkApi;
import com.joaosilva.mvp.network.models.LoginRequest;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

public class LoginPresenter implements LoginContract.Presenter{

    private NetworkApi api;
    private LoginContract.View view;

    @Inject
    LoginPresenter(NetworkApi api, LoginContract.View view) {
        this.api = api;
        this.view = view;
    }

    @Override
    public void doLogin(String username, String password) {
        api.login(new LoginRequest(username, password))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                    if(response.getStatusCode().equals("OK")){
                        view.loginSuccess();
                    } else {
                        view.showError("Login Error");
                    }
                }, error -> view.showError(error.getMessage()));
    }
}
