package com.zsml.textbannerview;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.gw.marqueview.MarqueeView;

/**
 * Copyright (C), 2017-2020, Gworld(平潭)互联网有限公司
 *
 * @author :        zlh <519009242@qq.com>
 * @date :          2020-04-13 18:23
 * @desc :
 */
public class MyApp extends Application {

    @Override

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


}
