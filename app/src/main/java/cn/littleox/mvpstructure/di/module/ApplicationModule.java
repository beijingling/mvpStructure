package cn.littleox.mvpstructure.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import cn.littleox.mvpstructure.base.Constant;
import cn.littleox.mvpstructure.data.DataManager;
import cn.littleox.mvpstructure.data.DataManagerImpl;
import cn.littleox.mvpstructure.data.database.DbOpenHelper;
import cn.littleox.mvpstructure.data.preference.AppPref;
import cn.littleox.mvpstructure.data.preference.AppPrefImpl;
import cn.littleox.mvpstructure.di.ApplicationContext;
import cn.littleox.mvpstructure.di.DBInfo;
import dagger.Module;
import dagger.Provides;

/**
 * common var & large range values were provided in here
 */
@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DBInfo
    String provideDBName() {
        return Constant.DBName;
    }

    @Provides
    DbOpenHelper provideDbOpenHelper(DbOpenHelper helper) {
        return helper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(DataManagerImpl manager){
        return manager;
    }

    @Provides
    AppPref provideAppPref(AppPrefImpl pref){
        return pref;
    }
}
