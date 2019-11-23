package cn.littleox.mvpstructure.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import cn.littleox.mvpstructure.data.network.Api;
import cn.littleox.mvpstructure.data.network.ApiService;
import cn.littleox.mvpstructure.data.preference.AppPref;
import cn.littleox.mvpstructure.di.ApplicationContext;
import io.reactivex.Observable;

@Singleton
public class DataManagerImpl implements DataManager{

    private Context mCtx;

    private static DataManagerImpl mInstance;

    private ApiService mApiService;

    private AppPref mAppPref;

    @Inject
    public DataManagerImpl(@ApplicationContext Context ctx, AppPref pref) {
        mCtx = ctx;
        mAppPref = pref;
        mApiService = Api.getApiService();
    }

    @Override
    public String getToken() {
        return mAppPref.getToken();
    }

    @Override
    public void setToken(String token) {
        mAppPref.setToken(token);
    }

    @Override
    public int getCurrentUserId() {
        return mAppPref.getCurrentUserId();
    }

    @Override
    public void setCurrentUserId(int userId) {
        mAppPref.setCurrentUserId(userId);
    }

    @Override
    public String getCurrentUserName() {
        return mAppPref.getCurrentUserName();
    }

    @Override
    public void setCurrentUserName(String userName) {
        mAppPref.setCurrentUserName(userName);
    }

    @Override
    public void setDeviceID(String deviceID) {
        mAppPref.setDeviceID(deviceID);
    }

    @Override
    public String getDeviceID() {
        return mAppPref.getDeviceID();
    }

    @Override
    public String getOSType() {
        return mAppPref.getOSType();
    }

    @Override
    public void setOSType(String type) {
        mAppPref.setOSType(type);
    }

    public ApiService getApiService(){
        return mApiService;
    }

}
