package com.plusystem.mobile.cpp.API;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

/**
 * Created by Santiago on 15/01/2017.
 */

public class RestClient {
    private static final String BASE_URL = "http://192.168.0.115:8081/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(Context context, String url, Header[]headers, RequestParams params,
                           AsyncHttpResponseHandler responseHandler) {
        client.get(context, getGetAbsoluteUrl(url), headers, params, responseHandler);
    }

    public static void post(Context context, String url, StringEntity entity,
                            String contentType, AsyncHttpResponseHandler responseHandler){
        client.post(context, getGetAbsoluteUrl(url), entity, contentType, responseHandler);
    }

    public static void put(){

    }

    public static void delete(){

    }

    public static void patch() {

    }

    public static String getGetAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
