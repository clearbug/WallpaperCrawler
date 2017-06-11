package com.clearbug.http;

/**
 * Created by clearbug on 2017/5/25.
 *
 * 该类表示 HTTP 协议中的请求方法。
 */
public enum RequestMethod {

    GET("GET"), POST("POST");

    private String methodName;

    private RequestMethod(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
