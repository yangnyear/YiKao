package com.swpuiot.yikao.data;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

/**
 * Created by 羊荣毅_L on 2017/4/11.
 * 访问网络
 */
public class NetWork {
    RequestParams mRequestParams;
    AsyncHttpClient mHttpClient;

    public NetWork() {
        mRequestParams = new RequestParams();
        mHttpClient = new AsyncHttpClient();
    }
    public void getnetWork(){
        mHttpClient.get("", mRequestParams, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {

            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }
        });
    }
}
