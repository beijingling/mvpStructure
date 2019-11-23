package cn.littleox.mvpstructure;

import android.app.Application;
import android.content.Context;

import cn.littleox.mvpstructure.di.componet.ApplicationComponent;
import cn.littleox.mvpstructure.di.componet.DaggerApplicationComponent;
import cn.littleox.mvpstructure.di.module.ApplicationModule;

public class MVPApplication extends Application {

    private static Context mContext;
    private ApplicationComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        mAppComponent = DaggerApplicationComponent.builder().applicationModule(
                new ApplicationModule(this)).build();
        mAppComponent.inject(this);
    }

    public static Context getAppContext(){
        return mContext;
    }

    public ApplicationComponent getAppComponent(){
        return mAppComponent;
    }
}
