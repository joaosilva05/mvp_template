package com.joaosilva.mvp.modules.login;

import com.joaosilva.mvp.network.NetworkComponent;
import com.joaosilva.mvp.util.CustomScope;

import dagger.Component;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

@CustomScope
@Component(dependencies = NetworkComponent.class, modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
