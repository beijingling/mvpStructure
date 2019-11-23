package cn.littleox.mvpstructure.data.preference;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

public class AppPrefImpl implements AppPref {

    private static final String PREF_KEY_PREF_FILE_NAME = "PREF_MVP";

    private static final String PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID";
    private static final String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";
    private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    private static final String PREF_KEY_OS_TYPE = "PREF_KEY_OS_TYPE";
    private static final String PREF_KEY_DEVICE_ID = "PREF_KEY_DEVICE_ID";

    private Context mCtx;

    private final SharedPreferences mPrefs;
    @Inject
    public AppPrefImpl(Context ctx) {
        mCtx = ctx;
        mPrefs = mCtx.getSharedPreferences(PREF_KEY_PREF_FILE_NAME, mCtx.MODE_PRIVATE);
    }


    @Override
    public String getToken() {
        return mPrefs.getString(PREF_KEY_ACCESS_TOKEN, "");
    }

    @Override
    public void setToken(String token) {
        mPrefs.edit().putString(PREF_KEY_ACCESS_TOKEN, token).apply();
    }

    @Override
    public int getCurrentUserId() {
        return mPrefs.getInt(PREF_KEY_CURRENT_USER_ID, 0);
    }

    @Override
    public void setCurrentUserId(int userId) {
        mPrefs.edit().putInt(PREF_KEY_CURRENT_USER_ID, userId).apply();
    }

    @Override
    public String getCurrentUserName() {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, "");
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_NAME, userName).apply();
    }

    @Override
    public void setDeviceID(String deviceID) {
        mPrefs.edit().putString(PREF_KEY_DEVICE_ID, deviceID).apply();
    }

    @Override
    public String getDeviceID() {
        return mPrefs.getString(PREF_KEY_DEVICE_ID, "");
    }

    @Override
    public String getOSType() {
        return mPrefs.getString(PREF_KEY_OS_TYPE, OS_TYPE_ANDROID);
    }

    @Override
    public void setOSType(String type) {
        mPrefs.edit().putString(PREF_KEY_OS_TYPE, OS_TYPE_ANDROID).apply();
    }
}
