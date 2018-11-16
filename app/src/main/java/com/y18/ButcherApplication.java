package com.y18;

import android.app.Application;

import com.y18.data.POIManager;

/**
 * Author: zyh
 * Date: 2018/11/13 16:58
 */
public class ButcherApplication extends Application {
    private static ButcherApplication sApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        POIManager.INSTANCE.init(this);
    }

    public static ButcherApplication getInstance(){
        return sApplication;
    }
}
