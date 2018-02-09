package com.joaosilva.mvp.network.models;

/**
 * Created by joaosilva on 07/02/2018.
 * No license.
 */

public class BaseResponse {
    private String statusCode;
    private String errorMessage;

    public String getStatusCode() {
        return statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
