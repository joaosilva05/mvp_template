package com.joaosilva.mvp.modules.login;

import com.joaosilva.mvp.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

@Module
class LoginModule {
    private final LoginContract.View view;

    LoginModule(LoginContract.View view) {
        this.view = view;
    }

    @Provides
    @CustomScope
    LoginContract.View provideLoginView(){
        return view;
    }
}
