package com.clearbug.http;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by clearbug on 2017/5/25.
 *
 * 该类表示请求头。
 */
public class RequestHeader {

    private static Map<String, String> requestHeaderMap = new HashMap<>();

    public static void add(String headerName, String headerValue) {
        requestHeaderMap.put(headerName, headerValue);
    }

    @Override
    public String toString() {
        String requestHeaderStr = "";
        for (String headerName : requestHeaderMap.keySet()) {
            requestHeaderStr += headerName + ": " + requestHeaderMap.get(headerName);
        }
        return requestHeaderStr;
    }
}
