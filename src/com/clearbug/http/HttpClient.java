package com.clearbug.http;

import java.net.Socket;

/**
 * Created by clearbug on 2017/5/25.
 */
public final class HttpClient {

    private String urlPath; // 请求路径

    private String protocol; // 协议及版本

    /**
     * final 化类，私有化构造函数，禁止继承该类以及实例化该类
     */
    private HttpClient() {}

    private void excute() {
        Socket socket = new Socket();
    }

}
