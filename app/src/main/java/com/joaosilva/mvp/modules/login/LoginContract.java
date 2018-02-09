package com.joaosilva.mvp.modules.login;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

public interface LoginContract {
    interface View {
        void showError(String message);
        void loginSuccess();
    }

    interface Presenter {
        void doLogin(String username, String password);
    }
}
