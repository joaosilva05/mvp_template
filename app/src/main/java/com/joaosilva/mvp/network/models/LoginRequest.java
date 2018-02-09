package com.joaosilva.mvp.network.models;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

public class LoginRequest {
    private String username;
    private String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
