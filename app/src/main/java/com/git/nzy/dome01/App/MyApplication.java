package com.git.nzy.dome01.App;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Created by NZY on 2017/5/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //二维码
        ZXingLibrary.initDisplayOpinion(this);
    }
}