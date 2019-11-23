package cn.littleox.mvpstructure.data.preference;

public interface AppPref {
    String OS_TYPE_ANDROID = "1";
    String getToken();

    void setToken(String token);

    int getCurrentUserId();

    void setCurrentUserId(int userId);

    String getCurrentUserName();

    void setCurrentUserName(String userName);

    void setDeviceID(String deviceID);

    String getDeviceID();

    String getOSType();

    void setOSType(String type);
}
