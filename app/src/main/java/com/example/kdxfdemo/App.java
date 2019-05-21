package com.example.kdxfdemo;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * 5ce3ac0a
 *
 * 通过，module的形式引入，需要下载官方最新的sdk，配置到项目中，
 * 读下载的sdk文档中的readme进行相应配置，目前这个demo运行是正常的;
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initKDXF();

    }

    // APPID 5ce3ac0a
    private void initKDXF() {
        SpeechUtility.createUtility(this, "appid=5ce3ac0a");
    }


}
