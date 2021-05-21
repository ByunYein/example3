package com.example.example3;

import android.content.ContentValues;

public class NetworkTask {

    private String url;
    private ContentValues values;

    public NetworkTask(String url, ContentValues values) {

        this.url = url;
        this.values = values;
    }


    protected String doInBackground(Void... params) {

        String result; // 요청 결과를 저장할 변수.
        RequestHttpURLConnection requestHttpURLConnection = new RequestHttpURLConnection();
        result = requestHttpURLConnection.request(url, values); // 해당 URL로 부터 결과물을 얻어온다.

        return result;
    }
}
